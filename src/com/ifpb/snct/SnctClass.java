package com.ifpb.snct;


import java.io.Serializable; 
public class SnctClass implements Serializable { 
private static final long serialVersionUID = 1633833011084400384L; 
int id;
int nota;
String nome_avaliador;
String titulo_trabalho; 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNota() {
	return nota;
}
public void setNota(int nota) {
	this.nota = nota;
}
public String getNome_avaliador() {
	return nome_avaliador;
}
public void setNome_avaliador(String nome_avaliador) {
	this.nome_avaliador = nome_avaliador;
}
public String getTitulo_trabalho() {
	return titulo_trabalho;
}
public void setTitulo_trabalho(String titulo_trabalho) {
	this.titulo_trabalho = titulo_trabalho;
}
public String getComentario() {
	return comentario;
}
public void setComentario(String comentario) {
	this.comentario = comentario;
}
String comentario; 
}