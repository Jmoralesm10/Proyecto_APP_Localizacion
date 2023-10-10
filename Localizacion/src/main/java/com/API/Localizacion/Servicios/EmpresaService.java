/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Servicios;

import com.API.Localizacion.Entity.Empresa;
import com.API.Localizacion.Repositorios.EmpresaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javie
 */
@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepo empresarepo;
    
    public Empresa insertar(Empresa emp){
        return empresarepo.save(emp);
    }
    
    public Empresa actualizar(Empresa emp){
        return empresarepo.save(emp);
    }
    
    public void eliminar(Empresa emp){
        empresarepo.delete(emp);
    }
    
    public List<Empresa> listar(){
        return empresarepo.findAll();
    }
}
