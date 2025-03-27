package com.vendaDeCavalo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Vendas")
public class Vendas {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idVendas;

	@Column (name = "Nome do cavalo")
	private String nomeCavalo;

	@Column (name = "Cliente") 
	private String cliente;

	@Column (name = "Preço")
	private String preco;

	public Long getIdVendas() {
		return idVendas;
	}

	public void setIdVendas(Long idVendas) {
		this.idVendas = idVendas;
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

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

}
