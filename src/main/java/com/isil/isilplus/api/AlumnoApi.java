package com.isil.isilplus.api;

import com.isil.isilplus.entity.Alumno;
import com.isil.isilplus.service.AlumnoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/alumnos")
@CrossOrigin(origins = "")
public class AlumnoApi {


    private final AlumnoService alumnoService;


    @GetMapping({"","/"})
    public ResponseEntity<List<Alumno>> get(){
        return ResponseEntity.ok(alumnoService.obtenerTodos());
    }


}
