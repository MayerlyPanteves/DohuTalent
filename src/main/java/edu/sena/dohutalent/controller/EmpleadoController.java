package edu.sena.dohutalent.controller;

import edu.sena.dohutalent.model.Empleado;
import edu.sena.dohutalent.service.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "formulario-empleado"; // Nombre exacto del archivo HTML sin .html
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado, RedirectAttributes redirectAttributes) {
        try {
            empleadoService.guardarEmpleado(empleado);
            redirectAttributes.addFlashAttribute("success", "Empleado guardado exitosamente");
            return "redirect:/empleados";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al guardar empleado: " + e.getMessage());
            return "redirect:/empleados/formulario";
        }
    }
}