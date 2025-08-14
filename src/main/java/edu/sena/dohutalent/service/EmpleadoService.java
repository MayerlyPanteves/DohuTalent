package edu.sena.dohutalent.service;

import edu.sena.dohutalent.model.Empleado;
import edu.sena.dohutalent.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Transactional
    public Empleado crearEmpleado(Empleado empleado) {
        if (empleadoRepository.existsByNumeroDocumento(empleado.getNumeroDocumento())) {
            throw new RuntimeException("Ya existe un empleado con este número de documento");
        }
        if (empleadoRepository.existsByEmail(empleado.getEmail())) {
            throw new RuntimeException("Ya existe un empleado con este email");
        }
        return empleadoRepository.save(empleado);
    }

    @Transactional(readOnly = true)
    public List<Empleado> listarTodos() {
        return empleadoRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Empleado buscarPorId(Long id) {
        return empleadoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado con ID: " + id));
    }

    @Transactional
    public Empleado actualizarEmpleado(Long id, Empleado empleadoActualizado) {
        Empleado empleadoExistente = buscarPorId(id);

        // Verificar si el número de documento ya existe (para otro empleado)
        if (!empleadoExistente.getNumeroDocumento().equals(empleadoActualizado.getNumeroDocumento()) &&
                empleadoRepository.existsByNumeroDocumento(empleadoActualizado.getNumeroDocumento())) {
            throw new RuntimeException("Ya existe otro empleado con este número de documento");
        }

        // Verificar si el email ya existe (para otro empleado)
        if (!empleadoExistente.getEmail().equals(empleadoActualizado.getEmail()) &&
                empleadoRepository.existsByEmail(empleadoActualizado.getEmail())) {
            throw new RuntimeException("Ya existe otro empleado con este email");
        }

        // Actualizar campos
        empleadoExistente.setTipoDocumento(empleadoActualizado.getTipoDocumento());
        empleadoExistente.setNumeroDocumento(empleadoActualizado.getNumeroDocumento());
        empleadoExistente.setPrimerNombre(empleadoActualizado.getPrimerNombre());
        empleadoExistente.setSegundoNombre(empleadoActualizado.getSegundoNombre());
        empleadoExistente.setPrimerApellido(empleadoActualizado.getPrimerApellido());
        empleadoExistente.setSegundoApellido(empleadoActualizado.getSegundoApellido());
        empleadoExistente.setSexo(empleadoActualizado.getSexo());
        empleadoExistente.setGrupoSanguineo(empleadoActualizado.getGrupoSanguineo());
        empleadoExistente.setDireccion(empleadoActualizado.getDireccion());
        empleadoExistente.setTelefono(empleadoActualizado.getTelefono());
        empleadoExistente.setEmail(empleadoActualizado.getEmail());
        empleadoExistente.setFechaNacimiento(empleadoActualizado.getFechaNacimiento());
        empleadoExistente.setBanco(empleadoActualizado.getBanco());
        empleadoExistente.setCuentaBancaria(empleadoActualizado.getCuentaBancaria());
        empleadoExistente.setFondoPension(empleadoActualizado.getFondoPension());
        empleadoExistente.setFondoSalud(empleadoActualizado.getFondoSalud());
        empleadoExistente.setTipoCuenta(empleadoActualizado.getTipoCuenta());

        return empleadoRepository.save(empleadoExistente);
    }

    @Transactional
    public void eliminarEmpleado(Long id) {
        Empleado empleado = buscarPorId(id);
        empleadoRepository.delete(empleado);
    }

    public void guardarEmpleado(Empleado empleado) {
    }
}