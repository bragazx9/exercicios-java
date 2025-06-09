package banco_imagens.demo.service;

import banco_imagens.demo.model.ImagemModel;
import banco_imagens.demo.repository.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagemService {
    @Autowired
    private ImagemRepository repository;

    public ImagemModel salvar(ImagemModel imagem) {
        return repository.save(imagem);
    }

    public List<ImagemModel> listarTodas() {
        return repository.findAll();
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }

    public Optional<ImagemModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public ImagemModel editar(Long id, ImagemModel novaImagem) {
        return repository.findById(id).map(imagem -> {
            imagem.setNome(novaImagem.getNome());
            imagem.setUrl(novaImagem.getUrl());
            return repository.save(imagem);
        }).orElse(null);
    }
}
