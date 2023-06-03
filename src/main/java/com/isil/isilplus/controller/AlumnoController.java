package com.isil.isilplus.controller;

import com.isil.isilplus.service.AlumnoService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("alumnos",alumnoService.obtenerTodos());
        return "alumno/index";
    }

    @GetMapping("/detalle")
    public String obtenerPorId(@RequestParam Long id, Model model) throws Exception {
        model.addAttribute("alumno",alumnoService.obtenerPorId(id));
        return "alumno/detalle";
    }



}
