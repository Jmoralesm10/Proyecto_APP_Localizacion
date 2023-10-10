/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Controllers;

import com.API.Localizacion.Entity.Piloto;
import com.API.Localizacion.Servicios.PilotoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javie
 */
@RestController
@RequestMapping("/api/piloto")
public class PilotoController {
    @Autowired
    private PilotoService pilotoservice;
    
    @GetMapping
    public List<Piloto> Listar () {
        return pilotoservice.listar();
    }
    
    @PostMapping
    public Piloto insertar (@RequestBody Piloto emp){
        return pilotoservice.insertar(emp);
    }
    
    @PutMapping
    public Piloto actualizar (@RequestBody Piloto emp){
        return pilotoservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Piloto emp){
        pilotoservice.eliminar(emp);
    }
}
