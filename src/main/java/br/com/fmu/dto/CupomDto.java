package br.com.fmu.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class CupomDto {
	
	@SerializedName("id")
	@JsonProperty("id")
	private int id;
	@SerializedName("parceiro")
	@JsonProperty("parceiro")
	private String parceiro;
	@SerializedName("cupom")
	@JsonProperty("cupom")
	private String cupom;
	@Column@SerializedName("validade")
	@JsonProperty("validade")
	private String validade;
	@SerializedName("descricao")
	@JsonProperty("descricao")
	private String descricao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParceiro() {
		return parceiro;
	}
	public void setParceiro(String parceiro) {
		this.parceiro = parceiro;
	}
	public String getCupom() {
		return cupom;
	}
	public void setCupom(String cupom) {
		this.cupom = cupom;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
