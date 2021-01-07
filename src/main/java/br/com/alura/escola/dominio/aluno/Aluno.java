package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {
	
	private final CPF cpf;
	private final String nome;	
	private final Email email;	
	private List<Telefone> telefones = new ArrayList<>();	
	private String senha;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public String getCpf() {
		return cpf.getNumero();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email.getEndereco();
	}
	
	public List<Telefone> getTelefones() {
		return Collections.unmodifiableList(this.telefones);
	}

	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}






