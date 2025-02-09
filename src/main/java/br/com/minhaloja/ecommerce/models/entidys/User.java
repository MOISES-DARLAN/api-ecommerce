package br.com.minhaloja.ecommerce.models.entidys;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.validator.constraints.br.CPF;


import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_pessoa;
    @NotNull
    private String name;
    @CPF
    private String cpf;
    @Email
    private String email;
    private String password;
    @Past
    private LocalDate data_birth;
    private LocalDate data_cadastre;

    @ManyToOne
    @JoinColumn(name = "Adress_cod_adress" )
    private Adress adress;

    public User(){
    }

    @PrePersist
    protected void onCreate(){
        this.data_cadastre = LocalDate.now();
    }

    public Long getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Long cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
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
