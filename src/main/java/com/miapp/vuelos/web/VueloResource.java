package com.miapp.vuelos.web;

import com.miapp.vuelos.dto.VueloDTO;
import com.miapp.vuelos.model.Vuelo;
import com.miapp.vuelos.service.VueloService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Path("/vuelos")
@Produces(MediaType.APPLICATION_JSON)
public class VueloResource {

    @Inject
    private VueloService servicio;

    @GET
    public List<VueloDTO> listar() {
        return servicio.listarTodos()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private VueloDTO toDTO(Vuelo v) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String fechaFormateada = v.getSalida() != null ? v.getSalida().format(formatter) : "N/D";
        

        return new VueloDTO(
            v.getId(), 
            v.getNumero(), 
            v.getCompania(), 
            v.getAvion(),
            v.getOrigen(), 
            v.getDestino(), 
            fechaFormateada
        );
    }
}