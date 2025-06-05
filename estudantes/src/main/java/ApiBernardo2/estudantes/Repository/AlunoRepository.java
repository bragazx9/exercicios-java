package ApiBernardo2.estudantes.Repository;

import ApiBernardo2.estudantes.Models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}

