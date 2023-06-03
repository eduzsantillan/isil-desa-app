package com.isil.isilplus.controller;

import com.isil.isilplus.entity.Alumno;
import com.isil.isilplus.service.AlumnoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/alumno")
public class AlumnoController {


    private final AlumnoService alumnoService;


    @GetMapping("")
    public String index(Model model){
        List<Alumno> alumnoList = alumnoService.obtenerTodos();

        List<String> listaVacia = new ArrayList<>();


        model.addAttribute("alumnos",
                alumnoList);
        return "alumno/index";
    }
}
