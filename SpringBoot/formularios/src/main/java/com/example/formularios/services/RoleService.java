package com.example.formularios.services;

import com.example.formularios.models.domain.Role;

import java.util.List;

public interface RoleService {

    public List<Role> listar();
    public Role obtenerPorId(Integer id);

}
