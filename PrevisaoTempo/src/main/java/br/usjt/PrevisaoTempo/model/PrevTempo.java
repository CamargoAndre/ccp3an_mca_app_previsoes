package br.usjt.PrevisaoTempo.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class PrevTempo implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String diaSemana;
	private Double tempMin;
	private Double tempMax;
	private Integer umidade;
	private String descricao;
	
	//Getters / Setters
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Double getTempMin() {
		return tempMin;
	}
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}
	public Double getTempMax() {
		return tempMax;
	}
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}
	public Integer getUmidade() {
		return umidade;
	}
	public void setUmidade(Integer umidade) {
		this.umidade = umidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
