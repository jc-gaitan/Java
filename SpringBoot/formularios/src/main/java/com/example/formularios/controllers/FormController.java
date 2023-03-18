package com.example.formularios.controllers;

import com.example.formularios.editors.NombreMayusculaEditor;
import com.example.formularios.editors.PaisPropertyEditor;
import com.example.formularios.editors.RolesEditor;
import com.example.formularios.models.domain.Pais;
import com.example.formularios.models.domain.Role;
import com.example.formularios.models.domain.Usuario;
import com.example.formularios.services.PaisService;
import com.example.formularios.services.RoleService;
import com.example.formularios.validations.UsuarioValidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@SessionAttributes("usuario")
public class FormController {

    @Autowired
    private UsuarioValidador validador;

    @Autowired
    private PaisService paisService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PaisPropertyEditor paisEditor;

    @Autowired
    private RolesEditor rolesEditor;

    @InitBinder
    public void initBinder(WebDataBinder binder){
        //Agrega las validaciones personalizadas a spring para que valide de forma automatica
        binder.addValidators(validador);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        //Registrar custom editor
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));

        binder.registerCustomEditor(String.class, "nombre",new NombreMayusculaEditor());
        binder.registerCustomEditor(String.class, "apellido",new NombreMayusculaEditor());

        binder.registerCustomEditor(Pais.class, "pais", paisEditor);

        binder.registerCustomEditor(Role.class, "roles", rolesEditor);
    }

    @ModelAttribute("paises")
    public List<String> paises(){
        return Arrays.asList("Colombia", "España", "Ecuador", "Chile", "Argentina");
    }

    @ModelAttribute("paisesMap")
    public Map<String, String> paisesMap(){
        Map<String, String> paises = new HashMap<String, String>();
        paises.put("ES", "España");
        paises.put("MX", "Mexico");
        paises.put("CL", "Chile");
        paises.put("AR", "Argentina");
        paises.put("CO", "Colombia");

        return paises;
    }

    @ModelAttribute("listRoles")
    public List<Role> listaRoles(){
        return this.roleService.listar();
    }

    @ModelAttribute("ListaPaises")
    public List<Pais> ListaPaises(){
        return paisService.listar();
    }

    @ModelAttribute("listRolesString")
    public List<String> listaRolesString(){
        List<String> roles = new ArrayList<>();
        roles.add("ROLE_ADMIN");
        roles.add("ROLE_USER");
        roles.add("ROLE_MODERATOR");

        return roles;
    }

    @ModelAttribute("listRolesMap")
    public Map<String, String> listRolesMap(){
        Map<String, String> roles = new HashMap<String, String>();
        roles.put("ROLE_ADMIN", "ADMIN");
        roles.put("ROLE_USER", "USUARIO");
        roles.put("ROLE_MODERATOR", "MODERADOR");

        return roles;
    }

    @GetMapping("/form")
    public String form(Model model){

        Usuario usuario = new Usuario();
        usuario.setIdentificador("12.123.12-D");
        usuario.setNombre("Juan");
        usuario.setApellido("Gaitan");
        usuario.setId("78asd45asd");
        usuario.setHabilitar(true);
        usuario.setValorSecreto("Valor secreto");
        usuario.setPais(new Pais(1, "CO", "Colombia"));
        usuario.setRoles(Arrays.asList(new Role(2, "Usuario", "ROLE_USER")));

        model.addAttribute("title", "Formulario");
        model.addAttribute("usuario", usuario);

        return "form";
    }

    @ModelAttribute("genero")
    public List<String> genero(){
        return Arrays.asList("Hombre", "Mujer", "Gato");
    }

    @PostMapping("/form")
    public String procesarForm(@Valid Usuario usuario, BindingResult result, Model model){
        //spring de forma automatica envia los datos a la instancia user
        //siempre y cuando los atributos y el requestparant tenga el mismo nombre

               //validador.validate(usuario, result);

        //BindingResult tiene el resultado del form para saber si es valido o no
        //Siempre el BindingResult tiene que estar justo despues del objeto que se valida
        if(result.hasErrors()){//verifica si el form tiene errores
            model.addAttribute("title", "Resultado formulario");
            return "form";
        }

        return "redirect:/ver";
    }

    @GetMapping("/ver")
    public String ver(@SessionAttribute(name="usuario", required = false) Usuario usuario, Model model, SessionStatus status){

        if(usuario == null){
            return "redirect:/form";
        }

        model.addAttribute("title", "Resultado formulario");

        //completa la sesion y elimina el objeto
        status.setComplete();

        return "result";
    }

}
