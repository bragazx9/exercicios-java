package rh_tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rh_tech.model.Cargo;
import rh_tech.service.CargoService;

import java.util.List;

@RestController
@RequestMapping("/api/cargos")
@CrossOrigin(origins = "*")
public class CargoController {
    @Autowired
    private CargoService service;

    @PostMapping
    public ResponseEntity<Cargo> create(@RequestBody Cargo cargo) {
        return ResponseEntity.ok(service.save(cargo));
    }

    @GetMapping
    public List<Cargo> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cargo> update(@PathVariable Long id, @RequestBody Cargo cargo) {
        return service.findById(id)
                .map(c -> {
                    cargo.setId(id);
                    return ResponseEntity.ok(service.save(cargo));
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
