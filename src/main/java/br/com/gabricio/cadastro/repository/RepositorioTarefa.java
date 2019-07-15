package br.com.gabricio.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabricio.models.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{

}
