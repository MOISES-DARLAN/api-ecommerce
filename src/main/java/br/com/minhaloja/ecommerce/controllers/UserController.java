package br.com.minhaloja.ecommerce.controllers;

import br.com.minhaloja.ecommerce.dtos.UserDTO;
import br.com.minhaloja.ecommerce.models.entidys.User;
import br.com.minhaloja.ecommerce.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findall(){
        List<User> listUsers = userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listUsers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id){
        try{
            User user = userService.findById(id);
            UserDTO userDTO = new UserDTO(user);
            return ResponseEntity.status(HttpStatus.OK).body(userDTO);
        }
        catch (ResponseStatusException e){
            return ResponseEntity.status(e.getStatusCode()).body(null);
        }
    }

    @PostMapping
    public ResponseEntity createUser(@Valid @RequestBody User user){
        try {
            UserDTO userDTO = userService.create(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);

        } catch (ResponseStatusException e) {
            return ResponseEntity.status(e.getStatusCode()).body(e.getBody());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable long id, @RequestBody User newUser){
        try{
            UserDTO user = userService.updateUser(id, newUser);
            return ResponseEntity.ok(user);
        } catch (ResponseStatusException e){
            return ResponseEntity.status(e.getStatusCode()).body(null);
        }
    }







}
