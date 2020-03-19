package br.usjt.PrevisaoTempo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PrevisaoTempo {
	
	@Id
	@GeneratedValue
	private Long id;
	private String diaSemana;
	private Double tempMinimo;
	private Double tempMaximo;
	private Integer humidade;
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
	public Double getTempMinimo() {
		return tempMinimo;
	}
	public void setTempMinimo(Double tempMinimo) {
		this.tempMinimo = tempMinimo;
	}
	public Double getTempMaximo() {
		return tempMaximo;
	}
	public void setTempMaximo(Double tempMaximo) {
		this.tempMaximo = tempMaximo;
	}
	public Integer getHumidade() {
		return humidade;
	}
	public void setHumidade(Integer humidade) {
		this.humidade = humidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
