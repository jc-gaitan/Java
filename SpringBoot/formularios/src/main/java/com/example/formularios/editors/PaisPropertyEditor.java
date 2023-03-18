package com.example.formularios.editors;

import com.example.formularios.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class PaisPropertyEditor extends PropertyEditorSupport {

    @Autowired
    private PaisService paisService;

    @Override
    public void setAsText(String id) throws IllegalArgumentException {
        try {
            this.setValue(paisService.obtenerPorId(Integer.parseInt(id)));
        } catch (NumberFormatException e) {
            setValue(null);
        }
    }
}
