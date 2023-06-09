package com.example.docker_compose.api;

import com.example.docker_compose.entity.User;
import com.example.docker_compose.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Tag(name = "User API")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello it is docker compose!";
    }
}
