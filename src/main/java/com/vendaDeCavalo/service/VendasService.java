package com.vendaDeCavalo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendaDeCavalo.Entities.Vendas;
import com.vendaDeCavalo.repository.VendasRepository;

@Service 
public class VendasService {
    private final VendasRepository vendasRepository;

    @Autowired
    public VendasService(VendasRepository vendasRepository) {
        this.vendasRepository = vendasRepository;
    }

    public Vendas saveVendas(Vendas vendas) {
        return vendasRepository.save(vendas);
    }

    public Vendas getVendasById(Long id) {
        return vendasRepository.findById(id).orElse(null);
    }

    public List<Vendas> getAllVendas() {
        return vendasRepository.findAll();
    }

    public void deleteVendas(Long idVendas) {
        vendasRepository.deleteById(idVendas);
    }
    public Vendas alterarVendas (Long idVendas, Vendas alterarVendas) {
    	Optional <Vendas> existeVendas = vendasRepository.findById(idVendas);
    	if (existeVendas.isPresent()) {
    		alterarVendas.setIdVendas(idVendas);
    		return vendasRepository.save(alterarVendas);
    	}
    	return null;
    }
}




