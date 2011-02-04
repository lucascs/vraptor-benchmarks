package br.com.poc.struts2.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	private String usuario;

	private String senha;

	private String email;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		Locale locale = new Locale("pt", "BR");

		DateFormat format = DateFormat.getDateInstance(DateFormat.LONG, locale);

		System.out.println(format.format(new Date()));
	}
}
