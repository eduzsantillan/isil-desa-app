package com.isil.isilplus.service;

import com.isil.isilplus.entity.Alumno;
import com.isil.isilplus.exception.AlumnoNoEcontradoException;
import com.isil.isilplus.repository.AlumnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public List<Alumno> obtenerTodos(){
        return alumnoRepository.findAll();
    }

    public Alumno obtenerPorId(Long id)  {
        return alumnoRepository.findById(id)
                .orElseThrow(() -> new AlumnoNoEcontradoException(id));
    }

    public Alumno guardar(Alumno alumno){
        return alumnoRepository.save(alumno);
    }


    public void eliminar(Long id){
        alumnoRepository.delete(alumnoRepository.findById(id).orElseThrow(
                ()-> new AlumnoNoEcontradoException(id)
        ));
    }

}
