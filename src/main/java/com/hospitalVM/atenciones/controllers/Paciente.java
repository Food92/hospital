package com.hospitalVM.atenciones.controllers;

import com.hospitalVM.atenciones.models.Audit;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name="paciente")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Paciente {

    /**
     * @Id-> se genera como la lleve primaria del elemento
     * @GenerateValue-> nos permite generar un id de la primaria key de forma automatica
     * @Column-> nos permite de modificar la propriedad de un campo, por ejemplo que no se nulo
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_paciente")
    private Long idPaciente;


    @NotBlank(message="El campo rut no puede ser vacio")
    @Column(nullable = false)
    @Pattern(regexp = "\\d{1,8}-[dKk]",message = "El formato del rut tiene que ser XXXXXXX-X")
    private String rut;

    @NotBlank(message = "El campo nombres no puede ser vacio")
    @Column(nullable = false)
    private String nombres;

    @NotBlank(message = "El campo de apellidos no puede ser vacio")
    @Column(nullable = false)
    private String apellidos;

    @NotBlank(message = "El campo de fecha nacimiento no puede ser vacio")
    @Column(nullable = false)
    private LocalDate fechaNacimiento;


    @Email(message = "El correo tiene que ser formato correo")
    @NotBlank(message = "El campo de email no puede ser vacio")
    @Column(nullable = false, unique = true)
    private String correo;


    @Embedded
    Audit audit= new Audit();

}
