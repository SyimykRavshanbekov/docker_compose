package com.example.docker_compose.service;


import com.example.docker_compose.entity.User;
import com.example.docker_compose.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
