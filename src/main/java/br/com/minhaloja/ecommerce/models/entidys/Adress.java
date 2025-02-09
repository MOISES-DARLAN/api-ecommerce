package br.com.minhaloja.ecommerce.models.entidys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_adress;
    private String cidade;
    private String estado;
    private String district;
    private int num_house;
    private String complement;

    public Adress(){}

    public Long getCod_adress() {
        return cod_adress;
    }

    public void setCod_adress(Long cod_adress) {
        this.cod_adress = cod_adress;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getNum_house() {
        return num_house;
    }

    public void setNum_house(int num_house) {
        this.num_house = num_house;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
