package br.com.minhaloja.ecommerce.dtos;

import br.com.minhaloja.ecommerce.models.entidys.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


import java.time.LocalDate;
import java.util.Optional;

public class UserDTO {
    @NotNull
    private long id;

    @NotEmpty(message = "name can not be empty")
    private String name;

    @NotNull(message = "cpf can not be Empty")
    private String cpf;

    @Email(message = "Email have to be valide")
    @NotBlank(message = "Email can not be empty")
    private String email;


    @NotNull(message = "data birth can not be null")
    private LocalDate data_birth;

    public UserDTO() {
    }

    public UserDTO(User user){
        this.id = user.getCod_pessoa();
        this.data_birth = user.getData_birth();
        this.cpf = user.getCpf();
        this.name = user.getName();
        this.email = user.getEmail();
    }


    public UserDTO(UserDTO byId) {
    }

    public UserDTO(Optional<User> user) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData_birth() {
        return data_birth;
    }

    public void setData_birth(LocalDate data_birth) {
        this.data_birth = data_birth;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }
}
