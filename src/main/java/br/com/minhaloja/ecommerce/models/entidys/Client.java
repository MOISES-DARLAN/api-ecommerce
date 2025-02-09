package br.com.minhaloja.ecommerce.models.entidys;

public class Client extends User {
    private Double discount;

    public Client(){}

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
