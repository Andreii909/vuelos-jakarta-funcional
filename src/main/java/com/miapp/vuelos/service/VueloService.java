package com.miapp.vuelos.service;

import com.miapp.vuelos.dao.VueloDAO;
import com.miapp.vuelos.model.Vuelo;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import java.util.List;

@RequestScoped
public class VueloService {

    @Inject
    private VueloDAO vueloDAO;

    public List<Vuelo> listarTodos() {
        return vueloDAO.findAll();
    }
}