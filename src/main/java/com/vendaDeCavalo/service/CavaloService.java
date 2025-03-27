package com.vendaDeCavalo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendaDeCavalo.Entities.Cavalo;
import com.vendaDeCavalo.repository.CavaloRepository;

@Service 
public class CavaloService {
    private final CavaloRepository cavaloRepository;

    @Autowired
    public CavaloService(CavaloRepository cavaloRepository) {
        this.cavaloRepository = cavaloRepository;
    }

    public Cavalo saveCavalo(Cavalo cavalo) {
        return cavaloRepository.save(cavalo);
    }

    public Cavalo getCavaloById(Long id) {
        return cavaloRepository.findById(id).orElse(null);
    }

    public List<Cavalo> getAllCavalo() {
        return cavaloRepository.findAll();
    }

    public void deleteCavalo(Long idCavalo) {
        cavaloRepository.deleteById(idCavalo);
    }
    
    
    public Cavalo alterarCavalo (Long idCavalo, Cavalo alterarCavalo) {
    	Optional <Cavalo> existeCavalo = cavaloRepository.findById(idCavalo);
    	if (existeCavalo.isPresent()) {
    		alterarCavalo.setIdCavalo(idCavalo);
    		return cavaloRepository.save(alterarCavalo);
    	}
    	return null;
    }
}



