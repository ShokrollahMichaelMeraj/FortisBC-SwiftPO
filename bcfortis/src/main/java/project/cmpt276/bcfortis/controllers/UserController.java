package project.cmpt276.bcfortis.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;



import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import project.cmpt276.bcfortis.models.userRepo;
import project.cmpt276.bcfortis.models.users;

@Controller
public class UserController {
    @Autowired
    private userRepo userRepo;


    @GetMapping("/")
    public RedirectView process(){
        return new RedirectView("login");
    }

    @PostMapping("users/add")
    public String addUser(@RequestParam Map<String, String> newuser, HttpServletResponse response){
        System.out.println("ADD user");
        String newName = newuser.get("name");
        String newPwd = newuser.get("password");
        userRepo.save(new users(newName,newPwd));
        response.setStatus(201);
        return "users/login";
    }
    

    @GetMapping("/login")
    public String getLogin(Model model, HttpServletRequest request, HttpSession session){
        users user = (users) session.getAttribute("session_user");
        if (user == null){
            return "users/login";
        }
        else {
            model.addAttribute("user",user);
            return "users/form";
        }
    }

    @PostMapping("/login")
    public String login(@RequestParam Map<String,String> formData, Model model, HttpServletRequest request, HttpSession session){
        // processing login
        String name = formData.get("name");
        String pwd = formData.get("password");
        List<users> userlist = userRepo.findByNameAndPassword(name, pwd);
        if (userlist.isEmpty()){
            return "users/login";
        }
        else {
            // success
            users user = userlist.get(0);
            request.getSession().setAttribute("session_user", user);
            model.addAttribute("users", user);
            return "users/form";
        }
    }
    @GetMapping("/form")
    public String usersForm (Model model){
        return ("users/form");
    }
    @GetMapping("/logging")
    public String usersLogin (Model model){
        return ("users/login");
    }
    @GetMapping("/logout")
    public String destroySession(HttpServletRequest request){
        request.getSession().invalidate();
        return "/users/login";
    }
}