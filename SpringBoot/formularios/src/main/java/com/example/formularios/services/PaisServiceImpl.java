package com.example.formularios.services;

import com.example.formularios.models.domain.Pais;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PaisServiceImpl implements PaisService{

    private List<Pais> lista;

    public PaisServiceImpl() {
        this.lista = Arrays.asList(
                new Pais(1, "CO", "Colombia"),
                new Pais(2, "AR", "Argentina"),
                new Pais(3, "MX", "Mexico"),
                new Pais(4, "CL", "Chile"),
                new Pais(5, "ES", "España"));
    }

    @Override
    public List<Pais> listar() {
        return lista;
    }

    @Override
    public Pais obtenerPorId(Integer id) {
        //Pais result = null;
        for (Pais pais: this.lista){
            if(pais.getId() == id){
                return pais;
            }
        }
        return null;
    }
}
