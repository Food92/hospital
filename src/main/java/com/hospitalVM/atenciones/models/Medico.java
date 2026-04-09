package com.hospitalVM.atenciones.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medico_id")
    private Long medicoId;

    @Column(unique = true, nullable = false)
    @NotBlank(message="El campo run no puede ser vacio ")
    @Pattern(regexp = "\\d{1,8}-[dKk]",message = "El formato del rut tiene que ser XXXXXXX-X")
    private String run;

    @Column(nullable = false, name = "nombre_completo")
    @NotBlank(message="El campo no puede ser vacio")
    private String nombreCompleto;

    @Column(name = "jefe_turno", nullable = false)
    @NotNull(message = "El campo de jefe de turno no puede ser nulo")
    private Boolean jefeTurno;

    @Embedded
    private Audit audit= new Audit();
}
