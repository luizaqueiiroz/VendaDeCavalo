package com.vendaDeCavalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendaDeCavalo.Entities.Vendas;
import com.vendaDeCavalo.service.VendasService;

@RestController
@RequestMapping("/vendas")

public class VendasController {
	private final VendasService vendasService;

	@Autowired
	public VendasController(VendasService vendasService) {
		this.vendasService = vendasService;
	}

	@PostMapping
	public Vendas createProduct(@RequestBody Vendas vendas) {
		return vendasService.saveVendas(vendas);
	}

	@GetMapping("/{id}")
	public Vendas getVendas(@PathVariable Long id) {
		return vendasService.getVendasById(id);
	}

	@GetMapping
	public List<Vendas> getAllVendas() {
		return vendasService.getAllVendas();
	}

	@DeleteMapping("/{id}")
	public void deleteVendas(@PathVariable Long id) {
		vendasService.deleteVendas(id);
	}
	public ResponseEntity<Vendas> alterarVendas (@PathVariable Long idVendas, @RequestBody Vendas vendas){
		Vendas alterarVendas = vendasService.alterarVendas(idVendas, vendas);
    	if(alterarVendas != null) {
    		return ResponseEntity.ok(alterarVendas);
    	}
    	else {
    		return ResponseEntity.notFound().build();
    	}
}
}


