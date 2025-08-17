package edu.sena.dohutalent.service;

import edu.sena.dohutalent.model.Empleado;
import edu.sena.dohutalent.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Empleado findById(String id) {
        return empleadoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado con id: " + id));
    }

    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public void deleteById(String id) {
        empleadoRepository.deleteById(id);
    }

    public List<Empleado> findBySegundoApellidoContaining(String segundoApellido) {
        return empleadoRepository.findBySegundoApellidoContaining(segundoApellido);
    }

    public List<Empleado> findByPrimerApellidoContaining(String primerApellido) {
        return empleadoRepository.findByPrimerApellidoContaining(primerApellido);
    }
}