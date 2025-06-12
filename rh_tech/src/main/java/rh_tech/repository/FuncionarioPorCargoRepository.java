package rh_tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rh_tech.model.FuncionarioPorCargo;

import java.util.List;

public interface FuncionarioPorCargoRepository extends JpaRepository<FuncionarioPorCargo, Long> {
    List<FuncionarioPorCargo> findByCargoId(Long cargoId);
    List<FuncionarioPorCargo> findByFuncionarioId(Long funcionarioId);
}
