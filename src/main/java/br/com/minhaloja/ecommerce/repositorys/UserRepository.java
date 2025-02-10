package br.com.minhaloja.ecommerce.repositorys;

import br.com.minhaloja.ecommerce.models.entidys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    User findByEmail(String email);

}
