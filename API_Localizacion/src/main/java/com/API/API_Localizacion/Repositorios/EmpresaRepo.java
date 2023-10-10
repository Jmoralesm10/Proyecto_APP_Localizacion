/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.API_Localizacion.Repositorios;

import com.API.API_Localizacion.Entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author javie
 */
@Repository
public interface EmpresaRepo extends JpaRepository <Empresa, String> {
    
}
