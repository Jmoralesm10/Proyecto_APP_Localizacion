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
@Table (name = "Tbl_Viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id_Viaje;
    private String Placa_camion;
    private String DPI_Piloto;
    private String Id_Empresa;
    private String Punto_Partida;
    private String Punto_Llegada;
    private String Descripcion;
    private String Fecha_Partida;
    private String Fecha_Llegada;
    private String Estado;

    public Integer getId_Viaje() {
        return Id_Viaje;
    }

    public void setId_Viaje(Integer Id_Viaje) {
        this.Id_Viaje = Id_Viaje;
    }

    public String getPlaca_camion() {
        return Placa_camion;
    }

    public void setPlaca_camion(String Placa_camion) {
        this.Placa_camion = Placa_camion;
    }

    public String getDPI_Piloto() {
        return DPI_Piloto;
    }

    public void setDPI_Piloto(String DPI_Piloto) {
        this.DPI_Piloto = DPI_Piloto;
    }

    public String getId_Empresa() {
        return Id_Empresa;
    }

    public void setId_Empresa(String Id_Empresa) {
        this.Id_Empresa = Id_Empresa;
    }

    public String getPunto_Partida() {
        return Punto_Partida;
    }

    public void setPunto_Partida(String Punto_Partida) {
        this.Punto_Partida = Punto_Partida;
    }

    public String getPunto_Llegada() {
        return Punto_Llegada;
    }

    public void setPunto_Llegada(String Punto_Llegada) {
        this.Punto_Llegada = Punto_Llegada;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha_Partida() {
        return Fecha_Partida;
    }

    public void setFecha_Partida(String Fecha_Partida) {
        this.Fecha_Partida = Fecha_Partida;
    }

    public String getFecha_Llegada() {
        return Fecha_Llegada;
    }

    public void setFecha_Llegada(String Fecha_Llegada) {
        this.Fecha_Llegada = Fecha_Llegada;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
