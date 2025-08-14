package edu.sena.dohutalent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformacionEmpleadoController {

    @GetMapping("/Informacionempleado")
    public String mostrarInformacionEmpleado() {
        return "informacion-empleado"; // Nombre del archivo HTML (sin extensión)
    }
}