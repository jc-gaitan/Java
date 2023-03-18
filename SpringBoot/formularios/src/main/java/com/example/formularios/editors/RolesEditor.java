package com.example.formularios.editors;

import com.example.formularios.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class RolesEditor extends PropertyEditorSupport {

    @Autowired
    private RoleService service;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            setValue(service.obtenerPorId(Integer.parseInt(text)));
        } catch (NumberFormatException e) {
            setValue(null);
        }
    }
}
