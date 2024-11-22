CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE  Produtor (
    id UUID gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sobre VARCHAR(250) NOT NULL,
    img_url VARCHAR(100) NOT NULL
)