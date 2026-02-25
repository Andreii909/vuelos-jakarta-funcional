package com.miapp.vuelos.dao;

import com.miapp.vuelos.model.Vuelo;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@RequestScoped
public class VueloDAOImpl implements VueloDAO {

    @PersistenceContext(unitName = "vuelosPU")
    private EntityManager em;

    @Override
    public List<Vuelo> findAll() {
        return em.createQuery("SELECT v FROM Vuelo v", Vuelo.class).getResultList();
    }
}