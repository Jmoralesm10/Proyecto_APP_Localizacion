/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Servicios;

import com.API.Localizacion.Entity.Historial_Ubicaciones;
import com.API.Localizacion.Repositorios.HistorialRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javie
 */
@Service
public class HistorialService {
     @Autowired
    private HistorialRepo historialrepo;
    
    public Historial_Ubicaciones insertar(Historial_Ubicaciones emp){
        return historialrepo.save(emp);
    }
    
    public Historial_Ubicaciones actualizar(Historial_Ubicaciones emp){
        return historialrepo.save(emp);
    }
    
    public void eliminar(Historial_Ubicaciones emp){
        historialrepo.delete(emp);
    }
    
    public List<Historial_Ubicaciones> listar(){
        return historialrepo.findAll();
    }
}
