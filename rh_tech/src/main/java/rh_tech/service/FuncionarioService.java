package rh_tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rh_tech.model.Funcionario;
import rh_tech.repository.FuncionarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public Funcionario save(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public List<Funcionario> findAll() {
        return repository.findAll();
    }

    public Optional<Funcionario> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public boolean existsByEmail(String email) {
        return repository.findByEmail(email).isPresent();
    }
}
