package com.example.crudconsola.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    @Column(name = "tipo_documento_cliente", nullable = false,columnDefinition = "int")
    private Integer tipoDocumentoCliente;
    @Column(name = "password_cliente", nullable = false, columnDefinition = "varchar(12)")
    private String passwordCliente;
    @Column(name = "nombre_cliente", nullable = false, columnDefinition = "varchar(20)")
    private String nombreCliente;
    @Column(name = "apellido1_cliente", nullable = false,columnDefinition = "varchar(25)")
    private String apellido1Cliente;
    @Column(name = "apellido2_cliente", nullable = false,columnDefinition = "varchar(25)")
    private String apellido2Cliente;
    @Column(name = "nacionalidad_cliente", nullable = false, columnDefinition = "varchar(50)")
    private String nacionalidadCliente;
    @Column(name = "fnac_cliente", nullable = false,columnDefinition = "date")
    private Date fnacCliente;
    @Column(name = "sexo_cliente", nullable = false, columnDefinition = "int")
    private Integer sexoCliente;
    @Column(name = "direccion_cliente", nullable = false, columnDefinition = "varchar(50)" )
    private String direccionCliente;
    @Column(name = "comuna_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String comunaCliente;
    @Column(name = "email_cliente", nullable = false, columnDefinition = "varchar(50)")
    private String emailCliente;
    @Column(name = "telefono_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String telefonoCliente;

    @OneToMany(mappedBy = "cliente")
    Set<Reserva> listaReservas;





}
