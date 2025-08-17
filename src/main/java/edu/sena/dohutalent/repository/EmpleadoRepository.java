package edu.sena.dohutalent.repository;

import edu.sena.dohutalent.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
    List<Empleado> findBySegundoApellidoContaining(String segundoApellido);
    List<Empleado> findByPrimerApellidoContaining(String primerApellido);
}