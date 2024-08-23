package com.example.reactive_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    // Na forma reativa 
    // Retornamos um Mono que vai ter em algum momento o User
    @PostMapping
    Mono<User> create(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Na forma reativa 
    // Utilizamos o flux em algum momento vamos ter o retorno
    @GetMapping
    Flux<User> list() {
        return userRepository.findAll();
    }
}
