/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Entity;

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
@Table (name = "Tbl_Piloto")
public class Piloto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    private String DPI_Piloto;
    private String Licencia_Conducir;
    private String Nombres;
    private String Apellidos;
    private String Direccion;
    private String Id_Empresa;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    public String getDPI_Piloto() {
        return DPI_Piloto;
    }

    public void setDPI_Piloto(String DPI_Piloto) {
        this.DPI_Piloto = DPI_Piloto;
    }

    public String getLicencia_Conducir() {
        return Licencia_Conducir;
    }

    public void setLicencia_Conducir(String Licencia_Conducir) {
        this.Licencia_Conducir = Licencia_Conducir;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getId_Empresa() {
        return Id_Empresa;
    }

    public void setId_Empresa(String Id_Empresa) {
        this.Id_Empresa = Id_Empresa;
    }
}
