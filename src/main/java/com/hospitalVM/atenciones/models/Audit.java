package com.hospitalVM.atenciones.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Audit {
    @Column(name = "created_at")
    private LocalDate createAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    //Metodo para definir automaticamente la fecha de cracion de algun elemento
    @PrePersist
    public void prePersist(){
        this.createAt= LocalDate.now();
    }

    //Metodo para definir automaticamente la fecha de la ultima modificacion
    @PreUpdate
    public void preUpdate(){
        this.updateAt=LocalDate.now();
    }



}
