CREATE TABLE Email(

    Id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    Email VARCHAR(100) NOT NULL UNIQUE,
    UsuarioId UUID,
    FOREIGN KEY (UsuarioId) REFERENCES Usuario(Id)

)