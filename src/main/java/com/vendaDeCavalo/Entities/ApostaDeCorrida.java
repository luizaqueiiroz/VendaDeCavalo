package com.vendaDeCavalo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Aposta")
public class ApostaDeCorrida {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idApostaDeCorrida;

	@Column (name = "Nome do cavalo")
	private String nomeCavalo;

	@Column (name = "Cliente") 
	private String cliente;

	@Column (name = "Quanto apostou")
	private String quantia;

	public Long getIdApostaDeCorrida() {
		return idApostaDeCorrida;
	}

	public void setIdApostaDeCorrida(Long idApostaDeCorrida) {
		this.idApostaDeCorrida = idApostaDeCorrida;
	}

	public String getNomeCavalo() {
		return nomeCavalo;
	}

	public void setNomeCavalo(String nomeCavalo) {
		this.nomeCavalo = nomeCavalo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getQuantia() {
		return quantia;
	}

	public void setQuantia(String quantia) {
		this.quantia = quantia;
	}

}
