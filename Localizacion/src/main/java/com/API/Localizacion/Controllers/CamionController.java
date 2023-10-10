/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Controllers;

import com.API.Localizacion.Entity.Camion;
import com.API.Localizacion.Servicios.CamionService;
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
@RequestMapping("/api/camion")
public class CamionController {
    @Autowired
    private CamionService camionservice;
    
    @GetMapping
    public List<Camion> Listar () {
        return camionservice.listar();
    }
    
    @PostMapping
    public Camion insertar (@RequestBody Camion emp){
        return camionservice.insertar(emp);
    }
    
    @PutMapping
    public Camion actualizar (@RequestBody Camion emp){
        return camionservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Camion emp){
        camionservice.eliminar(emp);
    }
    
}
