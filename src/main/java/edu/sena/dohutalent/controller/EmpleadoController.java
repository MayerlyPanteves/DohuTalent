package edu.sena.dohutalent.controller;

import edu.sena.dohutalent.model.Empleado;
import edu.sena.dohutalent.service.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleados") // Add this to base all mappings
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "Informacion-empleado";
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado) {
        empleadoService.guardarEmpleado(empleado);
        return "redirect:/Empleados?success=Empleado guardado correctamente";
    }

    @GetMapping("/Empleados") // Add this to handle the /empleados/Empleados request
    public String mostrarEmpleados() {
        return "redirect:/Empleados";
    }
}