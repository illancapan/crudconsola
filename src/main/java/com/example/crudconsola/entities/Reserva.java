package com.example.crudconsola.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private  Integer idReserva;
    @Column(name = "fecha_reserva")
    private Date fechaReserva;
    @Column(name ="baja_reserva")
    private boolean bajaReserva;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "reserva")
    private Atencion atencion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente")
    Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_profesional")
    Profesional profesional;


}
