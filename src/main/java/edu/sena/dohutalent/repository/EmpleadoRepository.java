package edu.sena.dohutalent.repository;

import edu.sena.dohutalent.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // ✅ AÑADE ESTA ANOTACIÓN
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    // Métodos personalizados si los necesitas
    boolean existsByIdentificacion(String identificacion);
}