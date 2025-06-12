package rh_tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rh_tech.model.Funcionario;
import rh_tech.service.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin(origins = "*")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Funcionario funcionario) {
        if (service.existsByEmail(funcionario.getEmail())) {
            return ResponseEntity.badRequest().body("{\"message\":\"Email já cadastrado.\"}");
        }
        return ResponseEntity.ok(service.save(funcionario));
    }

    @GetMapping
    public List<Funcionario> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> update(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        return service.findById(id)
                .map(f -> {
                    funcionario.setId(id);
                    return ResponseEntity.ok(service.save(funcionario));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
