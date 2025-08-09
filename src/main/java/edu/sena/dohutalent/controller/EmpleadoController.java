package edu.sena.dohutalent.controller;

import edu.sena.dohutalent.model.Empleado;
import edu.sena.dohutalent.service.EmpleadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @PostMapping
    public ResponseEntity<Empleado> crearEmpleado(@RequestBody Empleado empleado) {
        Empleado nuevoEmpleado = empleadoService.guardarEmpleado(empleado);
        return ResponseEntity.ok(nuevoEmpleado);
    }
}