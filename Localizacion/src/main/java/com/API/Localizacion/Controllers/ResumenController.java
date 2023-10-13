/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Controllers;

import com.API.Localizacion.Entity.VistaResumen;
import com.API.Localizacion.Repositorios.ResumenRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author javie
 */
@RestController
@RequestMapping("/api/resumen")
public class ResumenController {
    @Autowired
    private ResumenRepo resumenrepo;

    @GetMapping
    public List<VistaResumen> getViajes() {
        return resumenrepo.findAll();
    }
}
