package rh_tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rh_tech.model.Funcionario;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Optional<Funcionario> findByEmail(String email);
}
