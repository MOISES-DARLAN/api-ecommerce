package br.com.minhaloja.ecommerce.controllers;

import br.com.minhaloja.ecommerce.models.dtos.UserDTO;
import br.com.minhaloja.ecommerce.models.entidys.User;
import br.com.minhaloja.ecommerce.models.repositorys.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> findall(){
        List<User> listUser = userRepository.findAll();
        return listUser;
    }

    @PostMapping
    public User cresteUser(@Valid @RequestBody UserDTO user){
        User newUser = new User();
        newUser.setCpf(user.getCpf());
        newUser.setData_birth(user.getData_birth());
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        return userRepository.save(newUser);
    }

}
