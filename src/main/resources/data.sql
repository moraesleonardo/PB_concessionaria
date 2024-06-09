INSERT INTO MODELO(nome, descricao) VALUES ('Sedan', 'Carro de passeio com espaço para passageiros e bagagem.');
INSERT INTO MODELO(nome, descricao) VALUES ('SUV', 'Veículo utilitário esportivo, alto e espaçoso.');
INSERT INTO MODELO(nome, descricao) VALUES ('Hatchback', 'Carro compacto com porta traseira para bagagem.');

INSERT INTO MARCAS(nome, pais, email, data_fundacao)
VALUES ('Toyota', 'Japão', 'contact@toyota.jp', '1937-08-28');

INSERT INTO MARCAS(nome, pais, email, data_fundacao)
VALUES ('Ford', 'Estados Unidos', 'info@ford.com', '1903-06-16');

INSERT INTO ACESSORIO(nome, descricao) VALUES ('Ar Condicionado', 'Sistema de ar condicionado para climatização do carro.');
INSERT INTO ACESSORIO(nome, descricao) VALUES ('GPS', 'Sistema de navegação por GPS.');
INSERT INTO ACESSORIO(nome, descricao) VALUES ('Airbags', 'Sistema de segurança com airbags frontais e laterais.');
INSERT INTO ACESSORIO(nome, descricao) VALUES ('Rodas de Liga Leve', 'Conjunto de rodas de liga leve para maior durabilidade.');
INSERT INTO ACESSORIO(nome, descricao) VALUES ('Teto Solar', 'Teto solar panorâmico.');
INSERT INTO ACESSORIO(nome, descricao) VALUES ('Banco de Couro', 'Bancos revestidos em couro para maior conforto.');

INSERT INTO CARRO(nome, modelo_id, marca_id) VALUES ('Corolla', 1, 1);
INSERT INTO CARRO(nome, modelo_id, marca_id) VALUES ('Rav4', 2, 1);
INSERT INTO CARRO(nome, modelo_id, marca_id) VALUES ('Focus', 3, 2);
INSERT INTO CARRO(nome, modelo_id, marca_id) VALUES ('Mustang', 1, 2);

INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (1, 1);
INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (1, 3);
INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (1, 5);

INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (2, 2);
INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (2, 4);
INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (2, 6);

INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (3, 1);
INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (3, 2);
INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (3, 3);

INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (4, 4);
INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (4, 5);
INSERT INTO CARRO_ACESSORIOS(carro_id, acessorios_id) VALUES (4, 6);
