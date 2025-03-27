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

import com.vendaDeCavalo.Entities.Haras;
import com.vendaDeCavalo.service.HarasService;

@RestController
@RequestMapping("/haras")

public class HarasController {
    private final HarasService harasService;

    @Autowired
    public HarasController(HarasService harasService) {
        this.harasService = harasService;
    }

    @PostMapping
    public Haras createProduct(@RequestBody Haras haras) {
        return harasService.saveHaras(haras);
    }

    @GetMapping("/{id}")
    public Haras getHaras(@PathVariable Long id) {
        return harasService.getHarasById(id);
    }

    @GetMapping
    public List<Haras> getAllHaras() {
        return harasService.getAllHaras();
    }

    @DeleteMapping("/{id}")
    public void deleteHaras(@PathVariable Long id) {
        harasService.deleteHaras(id);
    }
    public ResponseEntity<Haras> alterarHaras (@PathVariable Long idHaras, @RequestBody Haras haras){
    	Haras alterarHaras = harasService.alterarHaras(idHaras, haras);
    	if(alterarHaras != null) {
    		return ResponseEntity.ok(alterarHaras);
    	}
    	else {
    		return ResponseEntity.notFound().build();
    	}
}
}



