package edu.sena.dohutalent.repository;

import edu.sena.dohutalent.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
    List<Empleado> findBySegundoApellidoContaining(String segundoApellido);
    List<Empleado> findByPrimerApellidoContaining(String primerApellido);
}