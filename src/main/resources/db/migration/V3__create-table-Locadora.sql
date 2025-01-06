
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE Locadora(

    Id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    NomeFantasia VARCHAR(100) NOT NULL,
    CNPJ CHAR(14) UNIQUE NOT NULL,
    EnderecoId UUID,
    FOREIGN KEY (EnderecoId) REFERENCES Endereco(Id)

);