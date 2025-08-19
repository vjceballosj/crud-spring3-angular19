package com.crudbooks.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor //crea un constructor vacío, ahorro de código gracias a Lombok
@RequiredArgsConstructor //crea un constructor con argumentos, ahorro de código gracias a Lombok
@Data
@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull ///indica al constructor con Argumentos que este campo es obligatorio Lombok
    private String titulo;

    @NonNull
    private boolean completado;

    @NonNull
    private LocalDateTime fechaCreacion;
}
