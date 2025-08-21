package edu.sena.dohutalent.service;

import edu.sena.dohutalent.model.Empleado;
import edu.sena.dohutalent.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // ✅ AÑADE ESTA ANOTACIÓN
@Transactional // ✅ AÑADE ESTA ANOTACIÓN
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService (EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        try {
            System.out.println("✅ Guardando empleado: " + empleado.getPrimerNombre() + " " + empleado.getPrimerApellido());
            System.out.println("✅ Identificación: " + empleado.getIdentificacion());
            return empleadoRepository.save(empleado);
        } catch (Exception e) {
            System.out.println("❌ Error al guardar empleado: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    public List<Empleado> listarTodosEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleado obtenerEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }
}