package br.com.minhaloja.ecommerce.services;

import br.com.minhaloja.ecommerce.dtos.UserDTO;
import br.com.minhaloja.ecommerce.models.entidys.User;
import br.com.minhaloja.ecommerce.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{
    @Autowired
    UserRepository userRepository;

    public User findById(long id){
        Optional<User> user = userRepository.findById(id);
        if (!user.isEmpty()){
            return new User(user);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
    }

    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public UserDTO create(User user){
        if(userRepository.existsByCpf(user.getCpf())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User with cpf: " + user.getCpf()+ " exist");
        }
        if (userRepository.existsByEmail(user.getEmail())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User with email" + user.getEmail() + " exist");
        }

        User newUser = userRepository.save(user);
        return new UserDTO(newUser);
    }

    public UserDTO updateUser(long id, User newUser){
        if(userRepository.existsById(id) && id == newUser.getCod_pessoa()){
            userRepository.save(newUser);
            return new UserDTO(newUser);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error: user not exist");
    }

}
