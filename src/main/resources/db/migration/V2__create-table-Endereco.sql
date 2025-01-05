CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE Endereco(
    Id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    Logradouro VARCHAR(100) NOT NULL,
        Numero VARCHAR(20) NOT NULL,
        Bairro VARCHAR(50),
        UF CHAR(2),
        Complemento VARCHAR(100),
        Tipo_Id UUID,
        FOREIGN KEY (Tipo_Id) REFERENCES TipoEndereco(Id)
);