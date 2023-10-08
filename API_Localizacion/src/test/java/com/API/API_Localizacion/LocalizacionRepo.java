/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.API_Localizacion.Repo;

/*import com.demorest.entity.Localizacionentity;*//*Aqui va el nombre del package del entity*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bardales
 */

@Repository
public interface LocalizacionRepo extends JpaRepository<LocalizacionRepo, Integer>{
    
}