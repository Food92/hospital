package com.hospitalVM.atenciones.repositories;

import com.hospitalVM.atenciones.controllers.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    // Metodo que me permite buscar por rut
    Optional<Paciente>findByRut(String rut);

    // Metodo que me permite buscar por correo
    Optional<Paciente>findByCorreo(String correo);
}
