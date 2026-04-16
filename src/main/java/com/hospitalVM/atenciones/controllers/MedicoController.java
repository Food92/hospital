package com.hospitalVM.atenciones.controllers;

import com.hospitalVM.atenciones.models.Medico;
import com.hospitalVM.atenciones.repositories.MedicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
@Controller
public class MedicoController {
    private MedicoRepository medicoRepository;

    @GetMapping
    public ResponseEntity<List<Medico>>findAll(){
        return
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<void> delete(@PathVariable Long id){

    }

}
