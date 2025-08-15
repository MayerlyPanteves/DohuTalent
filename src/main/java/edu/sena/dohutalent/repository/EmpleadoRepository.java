package edu.sena.dohutalent.repository;

import edu.sena.dohutalent.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}