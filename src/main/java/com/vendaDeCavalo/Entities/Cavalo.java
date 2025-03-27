package com.vendaDeCavalo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Cavalo")
public class Cavalo {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCavalo;

	@Column (name = "Nome")
	private String name;

	@Column (name = "Preço") 
	private String preco;

	public Long getIdCavalo() {
		return idCavalo;
	}

	public void setIdCavalo(Long idCavalo) {
		this.idCavalo = idCavalo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}


}

