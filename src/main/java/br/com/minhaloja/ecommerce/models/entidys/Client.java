package br.com.minhaloja.ecommerce.models.entidys;

import java.util.Optional;

public class Client extends User {
    private Double discount;

    public Client(Optional<User> byId) {
        super(byId);
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
