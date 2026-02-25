package com.miapp.vuelos.dto;

public class VueloDTO {
    private Integer id;
    private String numero;
    private String compania;
    private String avion;
    private String origen;
    private String destino;
    private String salida;

    public VueloDTO() {}

    // ¡Aquí está el orden blindado!
    public VueloDTO(Integer id, String numero, String compania, String avion, String origen, String destino, String salida) {
        this.id = id;
        this.numero = numero;
        this.compania = compania;
        this.avion = avion;
        this.origen = origen;
        this.destino = destino;
        this.salida = salida;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getCompania() { return compania; }
    public void setCompania(String compania) { this.compania = compania; }
    public String getAvion() { return avion; }
    public void setAvion(String avion) { this.avion = avion; }
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
    public String getSalida() { return salida; }
    public void setSalida(String salida) { this.salida = salida; }
}