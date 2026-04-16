package com.hospitalVM.atenciones.controllers;

import com.hospitalVM.atenciones.exceptions.MedicoException;
import com.hospitalVM.atenciones.exceptions.PacienteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ApiExceptionController {

   @ExceptionHandler(MedicoException.class)
    public ResponseEntity<?> handlerResponseEntity(MedicoException ex){
       HashMap<String, String> errors= new HashMap<>();
       errors.put("Error Medico", ex.getMessage());
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors);
   }

   @ExceptionHandler(PacienteException.class)
    public ResponseEntity<?> hanResponseEntity(PacienteException ex){
       HashMap<String, String> errors= new HashMap<>();
       errors.put("Error Paciente", ex.getMessage());
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errors);
   }

   @ExceptionHandler(Exception.class)
    public ResponseEntity<?> haResponseEntity(Exception ex){
       HashMap<String, String> errors= new HashMap<>();
       errors.put(ex.getMessage(), ex.getMessage());
       return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
   }


}
