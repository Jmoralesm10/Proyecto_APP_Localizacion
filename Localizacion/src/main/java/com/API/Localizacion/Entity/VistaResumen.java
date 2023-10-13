/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.API.Localizacion.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author javie
 */
@Entity
public class VistaResumen {
    
    @Id
    private Integer id_historial;
    private String hora_emision;
    private String fecha_emision;
    private String latitud;
    private String longitud;
    private Integer id_viaje;
    private String id_empresa;
    private String punto_llegada;
    private String punto_partida;
    private String descripcion_viaje;
    private String nombres;
    private String apellidos;
    private String dpi_piloto;
    private String placa_camion;

    public Integer getId_historial() {
        return id_historial;
    }

    public void setId_historial(Integer id_historial) {
        this.id_historial = id_historial;
    }

    public String getHora_emision() {
        return hora_emision;
    }

    public void setHora_emision(String hora_emision) {
        this.hora_emision = hora_emision;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Integer getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(Integer id_viaje) {
        this.id_viaje = id_viaje;
    }

    public String getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(String id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getPunto_llegada() {
        return punto_llegada;
    }

    public void setPunto_llegada(String punto_llegada) {
        this.punto_llegada = punto_llegada;
    }

    public String getPunto_partida() {
        return punto_partida;
    }

    public void setPunto_partida(String punto_partida) {
        this.punto_partida = punto_partida;
    }

    public String getDescripcion_viaje() {
        return descripcion_viaje;
    }

    public void setDescripcion_viaje(String descripcion_viaje) {
        this.descripcion_viaje = descripcion_viaje;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDpi_piloto() {
        return dpi_piloto;
    }

    public void setDpi_piloto(String dpi_piloto) {
        this.dpi_piloto = dpi_piloto;
    }

    public String getPlaca_camion() {
        return placa_camion;
    }

    public void setPlaca_camion(String placa_camion) {
        this.placa_camion = placa_camion;
    }
    
    
    
}
