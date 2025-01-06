CREATE TABLE Viagem (
    Id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    DataInicio TIMESTAMP,
    DataFim TIMESTAMP,
    KmInicial INTEGER NOT NULL,
    KmFinal INTEGER NOT NULL,
    ValorTotal INTEGER NOT NULL,
    UsuarioId UUID,
    VeiculoId UUID,
    FOREIGN KEY (UsuarioId) REFERENCES Usuario(Id),
    FOREIGN KEY (VeiculoId) REFERENCES Veiculo(Id)
);