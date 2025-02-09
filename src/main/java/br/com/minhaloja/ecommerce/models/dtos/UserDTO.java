package br.com.minhaloja.ecommerce.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Email;

import java.time.LocalDate;

public class UserDTO {
    @NotEmpty(message = "name can not be empty")
    private String name;

    @NotEmpty(message = "cpf can not be Empty")
    private String cpf;

    @Email(message = "Email have to be valide")
    @NotEmpty(message = "Email can not be empty")
    private String email;

    @NotEmpty(message = "passwor can not be empty")
    private String password;

    @NotEmpty(message = "data birth can not be empty")
    private LocalDate data_birth;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getData_birth() {
        return data_birth;
    }

    public void setData_birth(LocalDate data_birth) {
        this.data_birth = data_birth;
    }
}
