package me.dio.API.Banco.controller;

import me.dio.API.Banco.domain.model.User;
import me.dio.API.Banco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //TODO: criar UserResponse para não expor diretamente a entidade
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User rawUser = userService.findById(id);
        return ResponseEntity.ok(rawUser);
    }
    //TODO: implementar o retorno de uma lista com todos os usuários
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUsers = new ArrayList<>();

        return ResponseEntity.ok(allUsers);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User userToCreate){
        User createdUser = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdUser.getUsr_id())
                .toUri();
//Retorno Simples
//        return ResponseEntity.ok(createdUser);
//Retorno "elegante"
        return ResponseEntity.created(location).body(createdUser);
    }
}
