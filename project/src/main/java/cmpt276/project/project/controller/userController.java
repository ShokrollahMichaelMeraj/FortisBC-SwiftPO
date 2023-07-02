package cmpt276.project.project.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    
    @GetMapping("/group1")
    @PreAuthorize("hasRole('ROLE_group1')")
    public String group1(){
        return "hello group1 users";
    }
}
