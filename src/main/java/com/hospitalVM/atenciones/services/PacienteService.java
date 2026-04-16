package com.hospitalVM.atenciones.services;

import com.hospitalVM.atenciones.controllers.Paciente;

import java.util.List;

public interface PacienteService {
    List<Paciente>findByAll();
    Paciente findById(Long id);
    Paciente save(Paciente paciente);
    void deleteByRut(Long id);
    Paciente update(Long id, Paciente paciente);
    Paciente findByCorreo(String correo);
    Paciente findByRut(String rut);
}
