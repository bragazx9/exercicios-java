package rh_tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rh_tech.model.Cargo;
import rh_tech.repository.CargoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {
    @Autowired
    private CargoRepository repository;

    public Cargo save(Cargo cargo) {
        return repository.save(cargo);
    }

    public List<Cargo> findAll() {
        return repository.findAll();
    }

    public Optional<Cargo> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
