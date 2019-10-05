package br.com.fmu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Cupom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(insertable = false, updatable = false)
	int id;
	@Column
	String parceiro;
	@Column
	String cupom;
	@Column
	String validade;
	@Column
	String descricao;
	
	public Cupom() {}
	
	public Cupom(int id, String parceiro, String cupom, String validade, String descricao) {
		super();
		this.id = id;
		this.parceiro = parceiro;
		this.cupom = cupom;
		this.validade = validade;
		this.descricao = descricao;
	}

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
