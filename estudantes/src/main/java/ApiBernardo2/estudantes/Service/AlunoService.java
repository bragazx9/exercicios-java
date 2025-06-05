package ApiBernardo2.estudantes.Service;

import ApiBernardo2.estudantes.Models.AlunoModel;
import ApiBernardo2.estudantes.Repository.AlunoRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<AlunoModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<AlunoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public AlunoModel cadastrar(AlunoModel aluno) {
        return repository.save(aluno);
    }

    public Optional<AlunoModel> atualizar(Long id, AlunoModel aluno) {
        return repository.findById(id)
                .map(a -> {
                    a.setNome(aluno.getNome());
                    a.setEmail(aluno.getEmail());
                    return repository.save(a);
                });
    }

    public boolean deletar(Long id) {
        return repository.findById(id)
                .map(a -> {
                    repository.delete(a);
                    return true;
                }).orElse(false);
    }
}