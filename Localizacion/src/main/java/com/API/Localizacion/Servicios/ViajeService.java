/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Servicios;

import com.API.Localizacion.Entity.Viaje;
import com.API.Localizacion.Repositorios.ViajeRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javie
 */
@Service
public class ViajeService {
    @Autowired
    private ViajeRepo viajerepo;
    
    public Viaje insertar(Viaje emp){
        return viajerepo.save(emp);
    }
    
    public Viaje actualizar(Viaje emp){
        return viajerepo.save(emp);
    }
    
    public void eliminar(Viaje emp){
        viajerepo.delete(emp);
    }
    
    public List<Viaje> listar(){
        return viajerepo.findAll();
    }
}
