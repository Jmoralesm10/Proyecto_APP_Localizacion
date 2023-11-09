/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author javie
 */
@Entity
@Table (name = "Tbl_Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    
    @Column(name = "Id_Empresa", unique = true)
    private String idEmpresa;
    private String Nombre_Empresa;
    private String Password;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    @JsonProperty("Id_Empresa")
    public String getidEmpresa() {
        return idEmpresa;
    }

    public void setidEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre_Empresa() {
        return Nombre_Empresa;
    }

    public void setNombre_Empresa(String Nombre_Empresa) {
        this.Nombre_Empresa = Nombre_Empresa;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
