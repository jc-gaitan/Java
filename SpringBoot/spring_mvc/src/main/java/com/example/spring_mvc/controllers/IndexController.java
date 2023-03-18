package com.example.spring_mvc.controllers;

import com.example.spring_mvc.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/app") //la ruta raiz
//Para acceder a las rutas seria http://localhost:3000/app/
public class IndexController {

    @Value("${texto.indexcontroller.index.titulo}")
    private String textoIndex;

    @Value("${texto.indexcontroller.perfil.titulo}")
    private String textoPerfil;

    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;

    //Es ponemos las rutas dentro de {} mapeara todas las rutas escritas
    @GetMapping(value = {"/", "", "/home", "/index"})
    public String index(Model model) {
        //el objeto ModelMap y Model nos permite pasar datos a la vista html
        model.addAttribute("title", textoIndex);

        return "index";
    }

    @GetMapping(value = "/map")
    public String indexMap(Map<String, Object> map) {
        //Map tambien nos permite pasar datos a la vista html
        map.put("title", "Spring Pagina de inicio con MAP");

        //Para pasar un html se escribe en el return la nombre del archivo html
        return "index";
    }

    @GetMapping(value = "/modelviews")
    public ModelAndView indexModelAndView(ModelAndView mv) {
        //ModelAndView tambien nos permite pasar datos a la vista html
        mv.addObject("title", "Spring pagina de inicio ModelAndView");
        //enviarmos el nombre del archivo html que va a cargar
        mv.setViewName("index");

        return mv;
    }

    @RequestMapping(value = "/perfil", method = RequestMethod.GET)
    public String perfil(Model model) {
        UsuarioModel user = new UsuarioModel();
        user.setNombre("Juan");
        user.setApellido("Gaitan");
        user.setEmail("asd@asd.com");

        model.addAttribute("user", user);
        model.addAttribute("title", textoPerfil.concat(user.getNombre()));
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("title", textoListar);

        return "listar";
    }

    /*Se usa para pasar datos a varios html del controlador*/
    @ModelAttribute("usuarios")
    public List<UsuarioModel> listaUsuarios(){
        /*List<UsuarioModel> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioModel("Juan", "Gaitan", "asd@asd.com"));
        usuarios.add(new UsuarioModel("Andres", "Rojas", "rojas@gmail.com"));
        usuarios.add(new UsuarioModel("Jose", "Maria", "email@gmail.com"));*/

        //Convierte un arrays a una list
        List<UsuarioModel> usuarios = Arrays.asList(
                new UsuarioModel("Juan", "Gaitan", "asd@asd.com"),
                new UsuarioModel("Andres", "Rojas", "rojas@gmail.com"),
                new UsuarioModel("Jose", "Maria", "email@gmail.com"),
                new UsuarioModel("Julian", "Enrique", "email@gmail.com")
        );

        return usuarios;
    }
}
