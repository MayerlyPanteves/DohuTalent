package edu.sena.dohutalent.controller;

import edu.sena.dohutalent.model.Empleado;
import edu.sena.dohutalent.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    // Muestra la página estática
    @GetMapping
    public String mostrarListaEstatica() {
        return "forward:/empleados/Empleados.html";
    }

    // Muestra formulario para nuevo empleado
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "empleados/formulario";
    }

    // Procesa el formulario
    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/empleados";
    }

    // Muestra detalles de un empleado
    @GetMapping("/ver/{id}")
    public String verDetalles(@PathVariable String id, Model model) {
        Empleado empleado = empleadoService.findById(id);
        model.addAttribute("empleado", empleado);
        return "empleados/detalle";
    }

    // Elimina un empleado
    @GetMapping("/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable String id) {
        empleadoService.deleteById(id);
        return "redirect:/empleados";
    }
}