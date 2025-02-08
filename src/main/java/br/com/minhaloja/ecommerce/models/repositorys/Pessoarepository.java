package br.com.minhaloja.ecommerce.models.repositorys;

import br.com.minhaloja.ecommerce.models.entidys.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pessoarepository extends JpaRepository<Pessoa, Long> {
}
