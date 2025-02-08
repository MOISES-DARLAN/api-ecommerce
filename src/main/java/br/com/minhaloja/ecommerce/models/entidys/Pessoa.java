package br.com.minhaloja.ecommerce.models.entidys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_pessoa;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private LocalDate data_birth;
    private LocalDate data_cadastre;

    public Pessoa(){}

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
