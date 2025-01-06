CREATE TABLE Veiculo (
    Id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    Marca VARCHAR(20) NOT NULL,
    Modelo VARCHAR(100) NOT NULL,
    AnoFabricacao INTEGER,
    Placa VARCHAR(7),
    Cor VARCHAR(20),
    Tarifa INTEGER NOT NULL,
    Disponibilidade BOOLEAN NOT NULL,
    Estacionamento_Id UUID,
    FOREIGN KEY (Estacionamento_Id) REFERENCES Estacionamento(Id)
);