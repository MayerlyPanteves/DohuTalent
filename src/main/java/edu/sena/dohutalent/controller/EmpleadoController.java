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

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public String listarEmpleados(Model model) {
        model.addAttribute("empleados", empleadoService.findAll());
        return "empleados/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "empleados/formulario";
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/empleados";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("empleado", empleadoService.findById(id));
        return "empleados/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable Long id) {
        empleadoService.deleteById(id);
        return "redirect:/empleados";
    }

    @GetMapping("/buscar")
    public String buscarPorApellidos(
            @RequestParam(required = false) String segundoApellido,
            @RequestParam(required = false) String primerApellido,
            Model model) {

        if (segundoApellido != null && !segundoApellido.isEmpty()) {
            model.addAttribute("empleados", empleadoService.findBySegundoApellido(segundoApellido));
        } else if (primerApellido != null && !primerApellido.isEmpty()) {
            model.addAttribute("empleados", empleadoService.findByPrimerApellido(primerApellido));
        } else {
            model.addAttribute("empleados", empleadoService.findAll());
        }
        return "empleados/lista";
    }
}