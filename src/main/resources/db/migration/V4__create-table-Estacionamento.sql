CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE Estacionamento(

    Id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    LocadoraId UUID,
    EnderecoId UUID,
    FOREIGN KEY (LocadoraId) REFERENCES Locadora(Id),
    FOREIGN KEY (EnderecoId) REFERENCES  Endereco(Id)

)