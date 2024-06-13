package com.example.crudconsola.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_especialidad;

    @Column(name = "nombre_especialidad",columnDefinition = "varchar(25)",nullable = false)
    private String nombreEspecialidad;

    @Column(name = "descripcion_especialidad", columnDefinition = "varchar(100)",nullable = false)
    private String descripcionEspecialidad;

    @ManyToMany(mappedBy = "especialidades")
    private Set<Profesional> profesionales;

}
