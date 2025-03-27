package com.vendaDeCavalo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendaDeCavalo.Entities.ApostaDeCorrida;
import com.vendaDeCavalo.repository.ApostaDeCorridaRepository;

@Service 
public class ApostaDeCorridaService {
    private final ApostaDeCorridaRepository apostaDeCorridaRepository;

    @Autowired
    public ApostaDeCorridaService(ApostaDeCorridaRepository apostaDeCorridaRepository) {
        this.apostaDeCorridaRepository = apostaDeCorridaRepository;
    }

    public ApostaDeCorrida saveApostaDeCorrida(ApostaDeCorrida apostaDeCorrida) {
        return apostaDeCorridaRepository.save(apostaDeCorrida);
    }

    public ApostaDeCorrida getApostaDeCorridaById(Long id) {
        return apostaDeCorridaRepository.findById(id).orElse(null);
    }

    public List<ApostaDeCorrida> getAllApostaDeCorrida() {
        return apostaDeCorridaRepository.findAll();
    }

    public void deleteApostaDeCorrida(Long idApostaDeCorrida) {
        apostaDeCorridaRepository.deleteById(idApostaDeCorrida);
    }
    public ApostaDeCorrida alterarApostaDeCorrida (Long idApostaDeCorrida, ApostaDeCorrida alterarApostaDeCorrida) {
    	Optional <ApostaDeCorrida> existeApostaDeCorrida = apostaDeCorridaRepository.findById(idApostaDeCorrida);
    	if (existeApostaDeCorrida.isPresent()) {
    		alterarApostaDeCorrida.setIdApostaDeCorrida(idApostaDeCorrida);
    		return apostaDeCorridaRepository.save(alterarApostaDeCorrida);
    	}
    	return null;

}
}


