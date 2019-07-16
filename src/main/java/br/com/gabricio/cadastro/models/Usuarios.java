package br.com.gabricio.cadastro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "email", nullable = false, length = 100)
	@NotNull(message = "E-mail é obrigatório")
	@Length(min = 3, max = 100, message = "O E-mail deve conter entre 3 a 100 caracteres")
	private String email;

	@Column(name = "senha", nullable = false, length = 100)
	@NotNull(message = "A senha é obrigatória")
	@Length(min = 3, max = 100, message = "A senha deve conter entre 3 a 100 caracteres")
	private String senha;

	public Usuarios(Long id, String email, String senha) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
	}

	public Usuarios() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
