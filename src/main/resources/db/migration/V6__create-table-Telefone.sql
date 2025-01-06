CREATE TABLE Telefone(

    Id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    Tipo VARCHAR(20),
    DDD CHAR(2) NOT NULL,
    Numero VARCHAR(9) UNIQUE NOT NULL

);