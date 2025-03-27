package com.vendaDeCavalo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendaDeCavalo.Entities.Haras;
import com.vendaDeCavalo.repository.HarasRepository;

@Service 
public class HarasService {
    private final HarasRepository harasRepository;

    @Autowired
    public HarasService(HarasRepository harasRepository) {
        this.harasRepository = harasRepository;
    }

    public Haras saveHaras(Haras haras) {
        return harasRepository.save(haras);
    }

    public Haras getHarasById(Long id) {
        return harasRepository.findById(id).orElse(null);
    }

    public List<Haras> getAllHaras() {
        return harasRepository.findAll();
    }

    public void deleteHaras(Long idHaras) {
        harasRepository.deleteById(idHaras);
    }
    public Haras alterarHaras (Long idHaras, Haras alterarHaras) {
    	Optional <Haras> existeHaras = harasRepository.findById(idHaras);
    	if (existeHaras.isPresent()) {
    		alterarHaras.setIdHaras(idHaras);
    		return harasRepository.save(alterarHaras);
    	}
    	return null;
    }
}




