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
@Table (name = "Tbl_Camion")
public class Camion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    private String Placa_camion;
    private String No_Chasis;
    private String Marca;
    private String Id_Empresa;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    public String getPlaca_camion() {
        return Placa_camion;
    }

    public void setPlaca_camion(String Placa_camion) {
        this.Placa_camion = Placa_camion;
    }

    public String getNo_Chasis() {
        return No_Chasis;
    }

    public void setNo_Chasis(String No_Chasis) {
        this.No_Chasis = No_Chasis;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getId_Empresa() {
        return Id_Empresa;
    }

    public void setId_Empresa(String Id_Empresa) {
        this.Id_Empresa = Id_Empresa;
    }
}
