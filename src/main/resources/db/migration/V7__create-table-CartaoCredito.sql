CREATE TABLE CartaoCredito(

    Id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    Numero CHAR(16) NOT NULL,
    CVV CHAR(3) NOT NULL,
    Senha VARCHAR(6) NOT NULL,
    UsuarioId UUID,
    FOREIGN KEY (UsuarioId) REFERENCES Usuario(Id)
)