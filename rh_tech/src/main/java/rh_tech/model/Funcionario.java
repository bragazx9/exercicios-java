package rh_tech.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "funcionarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@NoArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String senha;

    private String cep;

    private String endereco;

    private String numero;

    private String bairro;

    private String cidade;

    private String estado;

   
}