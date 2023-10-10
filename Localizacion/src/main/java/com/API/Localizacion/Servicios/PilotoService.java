/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Servicios;

import com.API.Localizacion.Entity.Piloto;
import com.API.Localizacion.Repositorios.PilotoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javie
 */
@Service
public class PilotoService {
    @Autowired
    private PilotoRepo pilotorepo;
    
    public Piloto insertar(Piloto emp){
        return pilotorepo.save(emp);
    }
    
    public Piloto actualizar(Piloto emp){
        return pilotorepo.save(emp);
    }
    
    public void eliminar(Piloto emp){
        pilotorepo.delete(emp);
    }
    
    public List<Piloto> listar(){
        return pilotorepo.findAll();
    }
}
