package com.isil.isilplus.service;

import com.isil.isilplus.entity.Alumno;
import com.isil.isilplus.repository.AlumnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public List<Alumno> obtenerTodos(){
        return alumnoRepository.findAll();
    }

    public Alumno obtenerPorId(Long id) throws Exception {

        Optional<Alumno> alumno = alumnoRepository.findById(id);

        if(alumno.isPresent()){
            return alumno.get();
        }else{
            throw new Exception("El alumno no existe");
        }


    }

}
