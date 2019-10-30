package br.com.fmu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class NoticiaDto {
	
	@SerializedName("id")
	@JsonProperty("id")
	private int id;
	@SerializedName("data")
	@JsonProperty("data")
	private String data;
	@SerializedName("titulo")
	@JsonProperty("titulo")
	private String titulo;
	@SerializedName("texto")
	@JsonProperty("texto")
	private String texto;
	@SerializedName("link")
	@JsonProperty("link")
	private String link;
	@SerializedName("img")
	@JsonProperty("img")
	private String img;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
