package br.com.gabricio.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabricio.cadastro.models.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	Usuario findByEmail(String email);

}
