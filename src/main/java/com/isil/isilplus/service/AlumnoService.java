package com.isil.isilplus.service;

import com.isil.isilplus.entity.Alumno;
import com.isil.isilplus.exception.AlumnoNotFoundException;
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

    public Alumno obtenerPorId(Long id){
        Optional<Alumno> optionalAlumno = alumnoRepository.findById(id);
        if(optionalAlumno.isPresent()){
            return optionalAlumno.get();
        }else{
            throw new AlumnoNotFoundException(id);
        }
    }

    public Alumno registrar(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public void eliminar (Long id){
        Optional<Alumno> optionalAlumno = alumnoRepository.findById(id);
        if(optionalAlumno.isPresent()){
            alumnoRepository.delete(optionalAlumno.get());
        }else{
            throw new AlumnoNotFoundException(id);
        }
    }


}
