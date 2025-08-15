package edu.sena.dohutalent.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "home"; // Cambiado de redirect a vista directa
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/Cambiocontraseña")
    public String Cambiocontraseña() {
        return "Cambiocontraseña";
    }

    @GetMapping("/Crearusuario")
    public String Crearusuario() {
        return "Crearusuario";
    }

    @GetMapping("/Empleados")
    public String Empleados() {
        return "Empleados";
    }

    @GetMapping("/Nuevoempleado")
    public String Nuevoempleado() {
        return "informacion-empleado";
    }
}