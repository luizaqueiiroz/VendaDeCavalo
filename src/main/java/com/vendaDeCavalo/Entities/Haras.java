package com.vendaDeCavalo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Haras")
public class Haras {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idHaras;

	@Column (name = "Endereço")
	private String endereco;

	@Column (name = "Dono") 
	private String dono;

	public Long getIdHaras() {
		return idHaras;
	}

	public void setIdHaras(Long idHaras) {
		this.idHaras = idHaras;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}


}


