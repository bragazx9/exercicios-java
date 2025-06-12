package rh_tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rh_tech.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
