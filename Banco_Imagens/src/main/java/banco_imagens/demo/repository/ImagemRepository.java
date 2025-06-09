package banco_imagens.demo.repository;

import banco_imagens.demo.model.ImagemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagemRepository extends JpaRepository<ImagemModel, Long> {
}
