INSERT INTO TB_PARTICIPANTE(nome, email) VALUES ('Leonardo', 'leonardo@hotmail.com');

INSERT INTO TB_CATEGORIA(descricao) VALUES ('Olimpiadas de Matemática');

INSERT INTO TB_ATIVIDADE (nome, descricao, preco, categoria_id) VALUES ('Maratona de Matemática', 'Competição com desafios matemáticos', 50.0, 1);

INSERT INTO TB_BLOCO (inicio, fim, atividade_id) VALUES ('2026-04-10', '2026-04-12', 1);

INSERT INTO TB_PARTICIPANTE_ATIVIDADE(atividade_id, participante_id) VALUES (1,1);
