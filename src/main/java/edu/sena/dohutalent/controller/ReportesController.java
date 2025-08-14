package edu.sena.dohutalent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportesController {

    @GetMapping("/Reportes")
    public String mostrarReportes() {
        return "reportes"; // Nombre del archivo HTML (sin extensión)
    }
}
