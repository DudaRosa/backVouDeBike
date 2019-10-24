package br.com.fmu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;


public class EventoDto {
	
	@SerializedName("id")
	@JsonProperty("id")
	private int id;
	@SerializedName("data")
	@JsonProperty("data")
	private String data;
	@SerializedName("nome")
	@JsonProperty("nome")
	private String nome;
	@SerializedName("descricao")
	@JsonProperty("descricao")
	private String descricao;

	public EventoDto() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String date) {
		this.data = date;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
