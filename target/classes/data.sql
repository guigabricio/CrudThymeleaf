DROP TABLE IF EXISTS tarefas;
 
CREATE TABLE tarefas (
  id INT PRIMARY KEY AUTO_INCREMENT  ,
  titulo VARCHAR(50) NOT NULL,
  descricao VARCHAR(100) default NULL,
  data_expiracao DATE NOT NULL,
  concluida BIT DEFAULT FALSE
);
 
 
DROP TABLE IF EXISTS usuarios;
 
CREATE TABLE usuarios (
  id INT PRIMARY KEY AUTO_INCREMENT  ,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(100) not NULL
);
 