package com.br.orientacao.model.entity;

public class Fornecedor {
 private String nome;
 private String codigo;
 private String razaoSocial;
 private String telefone;
 
 
 
public Fornecedor(String nome, String codigo, String razaoSocial, String telefone) {
	this.nome = nome;
	this.codigo = codigo;
	this.razaoSocial = razaoSocial;
	this.telefone = telefone;
}




public Fornecedor(String nome, String razaoSocial) {
	this.nome = nome;
	this.razaoSocial = razaoSocial;
}




public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getRazaoSocial() {
	return razaoSocial;
}
public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}


@Override
public String toString() {
	return "Fornecedor [nome=" + nome + ", codigo=" + codigo + ", razaoSocial=" + razaoSocial + ", telefone=" + telefone
			+ "]";
}


 
 
 
 
}
