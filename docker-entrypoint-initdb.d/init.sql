CREATE TABLE IF NOT EXISTS movements (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    amount DECIMAL(19, 2) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO movements (description, amount) VALUES
('Ingreso Test', 987.65),
('Retiro Test', -123.45);