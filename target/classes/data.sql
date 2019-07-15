DROP TABLE IF EXISTS tarefas;
 
CREATE TABLE tarefas (
  id INT PRIMARY KEY AUTO_INCREMENT  ,
  titulo VARCHAR(50) NOT NULL,
  descricao VARCHAR(100) default NULL,
  data_expiracao DATE NOT NULL,
  concluida BIT DEFAULT FALSE
);
 