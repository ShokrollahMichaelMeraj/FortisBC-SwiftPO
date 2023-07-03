package project.cmpt276.bcfortis.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<users,Integer> {
    List<users> findByNameAndPassword(String name, String password);
}
