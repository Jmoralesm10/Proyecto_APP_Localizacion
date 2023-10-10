/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Controllers;

import com.API.Localizacion.Entity.Empresa;
import com.API.Localizacion.Servicios.EmpresaService;
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
@RequestMapping("/api/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaservice;
    
    @GetMapping
    public List<Empresa> Listar () {
        return empresaservice.listar();
    }
    
    @PostMapping
    public Empresa insertar (@RequestBody Empresa emp){
        return empresaservice.insertar(emp);
    }
    
    @PutMapping
    public Empresa actualizar (@RequestBody Empresa emp){
        return empresaservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Empresa emp){
       empresaservice.eliminar(emp);
    }
}
