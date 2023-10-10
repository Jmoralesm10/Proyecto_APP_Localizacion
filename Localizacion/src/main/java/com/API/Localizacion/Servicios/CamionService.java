/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Servicios;

import com.API.Localizacion.Entity.Camion;
import com.API.Localizacion.Repositorios.CamionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javie
 */
@Service
public class CamionService {
    @Autowired
    private CamionRepo camionrepo;
    
    public Camion insertar(Camion emp){
        return camionrepo.save(emp);
    }
    
    public Camion actualizar(Camion emp){
        return camionrepo.save(emp);
    }
    
    public void eliminar(Camion emp){
        camionrepo.delete(emp);
    }
    
    public List<Camion> listar(){
        return camionrepo.findAll();
    }
}
