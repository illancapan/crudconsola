package com.example.crudconsola.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "atencion")
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atencion")
    private Integer idAtencion;

    @OneToOne
    @JoinColumn(name = "id_reserva")
    private  Reserva reserva;

    @Column(name = "diagnostico_atencion")
    private String dignosticoAtencion;

    @Column(name = "tratamiento_atencion",columnDefinition = "varchar(400)")
    private String tratamientoAtencion;


}
