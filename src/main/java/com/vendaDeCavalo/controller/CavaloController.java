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

import com.vendaDeCavalo.Entities.Cavalo;
import com.vendaDeCavalo.service.CavaloService;

@RestController
@RequestMapping("/cavalo")

public class CavaloController {
    private final CavaloService cavaloService;

    @Autowired
    public CavaloController(CavaloService cavaloService) {
        this.cavaloService = cavaloService;
    }

    @PostMapping
    public Cavalo createProduct(@RequestBody Cavalo cavalo) {
        return cavaloService.saveCavalo(cavalo);
    }

    @GetMapping("/{id}")
    public Cavalo getCavalo(@PathVariable Long id) {
        return cavaloService.getCavaloById(id);
    }

    @GetMapping
    public List<Cavalo> getAllCavalo() {
        return cavaloService.getAllCavalo();
    }

    @DeleteMapping("/{id}")
    public void deleteCavalo(@PathVariable Long id) {
        cavaloService.deleteCavalo(id);
    }
    public ResponseEntity<Cavalo> alterarCavalo (@PathVariable Long idCavalo, @RequestBody Cavalo cavalo){
    	Cavalo alterarCavalo = cavaloService.alterarCavalo(idCavalo, cavalo);
    	if(alterarCavalo != null) {
    		return ResponseEntity.ok(alterarCavalo);
    	}
    	else {
    		return ResponseEntity.notFound().build();
    	}
    }
}



