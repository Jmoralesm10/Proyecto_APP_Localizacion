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
@Table (name = "Tbl_Historial_Ubicaciones")
public class Historial_Ubicaciones {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id_RegistroUbicacion;
    private Integer id_Viaje;
    private String Placa_camion;
    private String DPI_Piloto;
    private String Id_Empresa;
    private String Latitud;
    private String Longitud;
    private String Fecha_Emision;
    private String Hora_emision;

    public Integer getId_RegistroUbicacion() {
        return Id_RegistroUbicacion;
    }

    public void setId_RegistroUbicacion(Integer Id_RegistroUbicacion) {
        this.Id_RegistroUbicacion = Id_RegistroUbicacion;
    }

    public Integer getD_Viaje() {
        return id_Viaje;
    }

    public void setD_Viaje(Integer id_Viaje) {
        this.id_Viaje = id_Viaje;
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

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String Latitud) {
        this.Latitud = Latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }

    public String getFecha_Emision() {
        return Fecha_Emision;
    }

    public void setFecha_Emision(String Fecha_Emision) {
        this.Fecha_Emision = Fecha_Emision;
    }

    public String getHora_emision() {
        return Hora_emision;
    }

    public void setHora_emision(String Hora_emision) {
        this.Hora_emision = Hora_emision;
    }
}
