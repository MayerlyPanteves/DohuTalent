package edu.sena.dohutalent.service;

import edu.sena.dohutalent.model.Empleado;
import edu.sena.dohutalent.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public void guardarEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    public List<Empleado> listarTodos() {
        return empleadoRepository.findAll();
    }
}