/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Controllers;

import com.API.Localizacion.Entity.Historial_Ubicaciones;
import com.API.Localizacion.Servicios.HistorialService;
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
@RequestMapping("/api/historial")
public class HistorialController {
    @Autowired
    private HistorialService historialservice;
    
    @GetMapping
    public List<Historial_Ubicaciones> Listar () {
        return historialservice.listar();
    }
    
    @PostMapping
    public Historial_Ubicaciones insertar (@RequestBody Historial_Ubicaciones emp){
        return historialservice.insertar(emp);
    }
    
    @PutMapping
    public Historial_Ubicaciones actualizar (@RequestBody Historial_Ubicaciones emp){
        return historialservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Historial_Ubicaciones emp){
        historialservice.eliminar(emp);
    }
}
