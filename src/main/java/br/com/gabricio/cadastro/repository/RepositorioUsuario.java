package br.com.gabricio.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabricio.cadastro.models.Usuarios;

public interface RepositorioUsuario extends JpaRepository<Usuarios, Long>{
	
	Usuarios findByEmail(String email);

}
