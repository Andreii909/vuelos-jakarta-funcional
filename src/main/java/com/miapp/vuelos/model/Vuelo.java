package com.miapp.vuelos.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vista_vuelos")
public class Vuelo {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "compania")
    private String compania;

    @Column(name = "origen")
    private String origen;

    @Column(name = "destino")
    private String destino;

    @Column(name = "salida")
    private LocalDateTime salida;
    
    @Column(name = "avion")
    private String avion;

    public Vuelo() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getCompania() { return compania; }
    public void setCompania(String compania) { this.compania = compania; }
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
    public LocalDateTime getSalida() { return salida; }
    public void setSalida(LocalDateTime salida) { this.salida = salida; }
    public String getAvion() { return avion; }
    public void setAvion(String avion) { this.avion = avion; }
}