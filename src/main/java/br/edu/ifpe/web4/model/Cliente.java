package br.edu.ifpe.web4.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String celular;
	private String cidade;
	
	public Cliente() {
		
	}
	
	public Cliente(Long id, String nome, String email, String celular, String cidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(celular, cidade, email, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(celular, other.celular) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", celular=" + celular + ", cidade="
				+ cidade + "]";
	}
	
	
	
	

}
