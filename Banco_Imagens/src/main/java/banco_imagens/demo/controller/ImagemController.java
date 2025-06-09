package banco_imagens.demo.controller;

import banco_imagens.demo.model.ImagemModel;
import banco_imagens.demo.service.ImagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/imagens")
@CrossOrigin(origins = "*")
public class ImagemController {
    @Autowired
    private ImagemService service;

    @PostMapping
    public ImagemModel adicionar(@RequestBody ImagemModel imagem) {
        return service.salvar(imagem);
    }

    @GetMapping
    public List<ImagemModel> listar() {
        return service.listarTodas();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImagemModel> editar(@PathVariable Long id, @RequestBody ImagemModel imagem) {
        ImagemModel editada = service.editar(id, imagem);
        if (editada != null) {
            return ResponseEntity.ok(editada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
