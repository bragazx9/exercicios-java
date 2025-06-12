CREATE TABLE funcionario_por_cargo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    funcionario_id BIGINT NOT NULL,
    cargo_id BIGINT NOT NULL,
    detalhes VARCHAR(255),
    data_inicio DATE NOT NULL,
    data_fim DATE,
    CONSTRAINT fk_funcionario FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id),
    CONSTRAINT fk_cargo FOREIGN KEY (cargo_id) REFERENCES cargos(id)
);
