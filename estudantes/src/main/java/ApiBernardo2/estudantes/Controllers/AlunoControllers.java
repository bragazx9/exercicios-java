package ApiBernardo2.estudantes.Controllers;

import ApiBernardo2.estudantes.Models.AlunoModel;
import ApiBernardo2.estudantes.Service.AlunoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/alunos")
public class AlunoControllers {

    private final AlunoService service;

    public AlunoControllers(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<AlunoModel> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AlunoModel cadastrar(@RequestBody AlunoModel aluno) {
        return service.cadastrar(aluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoModel> atualizar(@PathVariable Long id, @RequestBody AlunoModel aluno) {
        return service.atualizar(id, aluno)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return service.deletar(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
