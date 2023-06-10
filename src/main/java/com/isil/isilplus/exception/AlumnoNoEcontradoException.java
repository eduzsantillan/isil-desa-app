package com.isil.isilplus.exception;

public class AlumnoNoEcontradoException extends RuntimeException{

    public AlumnoNoEcontradoException(Long id){
        super(String.format("Alumno con id %s no existe en la base de datos",id));
    }
}
