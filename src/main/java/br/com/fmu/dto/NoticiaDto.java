package br.com.fmu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class NoticiaDto {
	
	@SerializedName("id")
	@JsonProperty("id")
	private int id;
	@SerializedName("dia")
	@JsonProperty("dia")
	private String dia;
	@SerializedName("hora")
	@JsonProperty("hora")
	private String hora;
	@SerializedName("titulo")
	@JsonProperty("titulo")
	private String titulo;
	@SerializedName("texto")
	@JsonProperty("texto")
	private String texto;
	@SerializedName("link")
	@JsonProperty("link")
	private String link;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
}
