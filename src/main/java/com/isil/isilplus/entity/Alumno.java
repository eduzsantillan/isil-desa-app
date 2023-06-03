package com.isil.isilplus.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="alumnos")
@Data
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String primerNombre;
    private String apellidos;
    private String correo;
    private String celular;

}
