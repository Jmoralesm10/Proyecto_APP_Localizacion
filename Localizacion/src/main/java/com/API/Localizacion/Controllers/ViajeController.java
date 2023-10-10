/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Controllers;

import com.API.Localizacion.Entity.Viaje;
import com.API.Localizacion.Servicios.ViajeService;
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
@RequestMapping("/api/viaje")
public class ViajeController {
    @Autowired
    private ViajeService viajeservice;
    
    @GetMapping
    public List<Viaje> Listar () {
        return viajeservice.listar();
    }
    
    @PostMapping
    public Viaje insertar (@RequestBody Viaje emp){
        return viajeservice.insertar(emp);
    }
    
    @PutMapping
    public Viaje actualizar (@RequestBody Viaje emp){
        return viajeservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Viaje emp){
        viajeservice.eliminar(emp);
    }
}
