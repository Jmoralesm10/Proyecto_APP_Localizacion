/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Controllers;

import com.API.Localizacion.Entity.Empresa;
import com.API.Localizacion.Servicios.EmpresaService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public List<Empresa> Listar() {
        return empresaservice.listar();
    }

    @PostMapping
    public Empresa insertar(@RequestBody Empresa emp) {
        return empresaservice.insertar(emp);
    }

    @PutMapping
    public Empresa actualizar(@RequestBody Empresa emp) {
        return empresaservice.actualizar(emp);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Empresa emp) {
        empresaservice.eliminar(emp);
    }

    @PostMapping("/login")

    public ResponseEntity<String> login(@RequestBody Map<String, String> body) {
        String idEmpresa = body.get("Id_Empresa");
        String Password = body.get("Password");

        Empresa empresa = empresaservice.findByidEmpresa(idEmpresa);

        if (empresa != null && empresa.getPassword().equals(Password)) {
            return ResponseEntity.ok("¡Login exitoso!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario o contraseña incorrectos");
        }
    }

}
