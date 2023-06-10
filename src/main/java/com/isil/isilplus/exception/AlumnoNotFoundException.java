package com.isil.isilplus.exception;

public class AlumnoNotFoundException extends RuntimeException{

    public AlumnoNotFoundException(Long id){
        super(String.format("Alumno con id : %s no registrado en la base de datos",id));
    }
}
