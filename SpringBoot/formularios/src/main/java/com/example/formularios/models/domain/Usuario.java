package com.example.formularios.models.domain;

import com.example.formularios.validations.IdentificadorRegex;
import com.example.formularios.validations.Requerido;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

public class Usuario {

    private String id;

    //@NotEmpty
    //@Pattern(regexp = "[0-9]{2}[.,][\\d]{3}[.,][\\d]{2}[-][A-Z]{1}")
    @IdentificadorRegex
    private String identificador;
    //En el archivo messagez.properties estan los mensajes personalizados de error
    @NotBlank(message = "No puede estar vacio el cambio") //valida que no este vacio y no tenga solo espacios en blanco
    @Size(min = 3, max = 8) //solo sirve para String @Min y @Max es para numeros
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty //Es para String
    @Email() //valida que esa un email
    private String email;

    @NotNull //Es para objetos
    @Min(5) //minimo el numero 5
    @Max(5000) // maximo el numero 5000
    private Integer cuenta;

    @NotNull(message = "No puede estar vacio")
    //@DateTimeFormat(pattern = "yyyy-MM-dd") //el patron que se va a mostrar la fecha
    //@Past //Una fecha pasada de la actual
    //@Future //Una fecha futura de la actual
    @PastOrPresent //una fecha pasada de la actual o la actual
    private Date fechaNacimiento;

    //@Valid //Para que se valide los atributos de Pais
    @NotNull
    private Pais pais;

    @NotEmpty
    private List<Role> roles;

    private Boolean habilitar;

    @NotEmpty
    private String genero;

    private String valorSecreto;

    //@NotEmpty
    private String nombre;
    //@NotEmpty
    @Requerido
    private String apellido;

    public Usuario() {
    }

    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Boolean getHabilitar() {
        return habilitar;
    }

    public void setHabilitar(Boolean habilitar) {
        this.habilitar = habilitar;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValorSecreto() {
        return valorSecreto;
    }

    public void setValorSecreto(String valorSecreto) {
        this.valorSecreto = valorSecreto;
    }
}
