package br.com.minhaloja.ecommerce.models.entidys;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


import java.time.LocalDate;
import java.util.Optional;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_pessoa;

    @NotNull
    @Size(min = 6, message = "the name have to be 6 caracter")
    private String name;

    @NotNull
    private String cpf;

    @Email
    @NotNull
    private String email;

    @NotNull
    @Size(min = 6, message = "The name have to be 6 carater")
    private String password;

    @Past
    @NotNull
    private LocalDate data_birth;

    private LocalDate data_cadastre;

    @ManyToOne
    @JoinColumn(name = "Adress_cod_adress" )
    private Adress adress;

    public User(Optional<User> user){
        this.cod_pessoa = user.get().getCod_pessoa();
        this.name = user.get().getName();
        this.cpf = user.get().getCpf();
        this.email = user.get().getEmail();
        this.password = user.get().getPassword();
        this.adress = user.get().adress;
        this.data_cadastre = user.get().data_cadastre;
        this.data_birth = user.get().getData_birth();
    }

    public User(){

    }

    public User(Long cod_pessoa, String name, String cpf, String email, String password, Adress adress, LocalDate data_cadastre, LocalDate data_birth) {
        this.cod_pessoa = cod_pessoa;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.adress = adress;
        this.data_cadastre = data_cadastre;
        this.data_birth = data_birth;
    }

    @PrePersist
    protected void onCreate(){
        this.data_cadastre = LocalDate.now();
    }

    public Long getCod_pessoa() {
        return cod_pessoa;
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

    public LocalDate getData_cadastre() {
        return data_cadastre;
    }

    public void setData_cadastre(LocalDate data_cadastre) {
        this.data_cadastre = data_cadastre;
    }

}
