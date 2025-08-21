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
    public EmpleadoController(EmpleadoService empleadoServicio) {
        this.empleadoService = empleadoServicio;
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "empleados/formulario";
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado) {
        try {
            empleadoService.guardarEmpleado(empleado);
            System.out.println("✅ Empleado guardado exitosamente!");
            System.out.println("✅ ID: " + empleado.getId());
            System.out.println("✅ Nombre: " + empleado.getPrimerNombre());
            System.out.println("✅ Identificación: " + empleado.getIdentificacion());
        } catch (Exception e) {
            System.out.println("❌ Error al guardar empleado: " + e.getMessage());
            e.printStackTrace();
        }
        return "redirect:/empleados/lista";
    }

    @GetMapping("/lista")
    public String listarEmpleados(Model model) {
        try {
            var empleados = empleadoService.listarTodosEmpleados();
            model.addAttribute("empleados", empleados);
            System.out.println("✅ Empleados encontrados: " + empleados.size());
        } catch (Exception e) {
            System.out.println("❌ Error al listar empleados: " + e.getMessage());
            e.printStackTrace();
        }
        return "empleados/lista";
    }
}