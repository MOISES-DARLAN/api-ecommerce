package br.com.minhaloja.ecommerce.models.repositorys;

import br.com.minhaloja.ecommerce.models.entidys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
