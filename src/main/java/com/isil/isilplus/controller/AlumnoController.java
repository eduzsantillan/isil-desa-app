package com.isil.isilplus.controller;

import com.isil.isilplus.entity.Alumno;
import com.isil.isilplus.service.AlumnoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@AllArgsConstructor
@Controller
@RequestMapping("/alumno")
public class AlumnoController {


    private final AlumnoService alumnoService;


    @GetMapping("")
    public String index(Model model){
        model.addAttribute("alumnos",
                alumnoService.obtenerTodos());
        return "alumno/index";
    }

    @PostMapping("")
    public String registrar(@ModelAttribute("alumno") Alumno alumno){
        alumnoService.registrar(alumno);
        return "redirect:/alumno";
    }

    @GetMapping("/editar")
    public String editar(@RequestParam("id") Long id,Model model){
        model.addAttribute("alumno", alumnoService.obtenerPorId(id));
        return "alumno/editar";
    }

    @PutMapping("/editar")
    public String editar(@ModelAttribute("alumno") Alumno alumno){
        alumnoService.registrar(alumno);
        return "redirect:/alumno";
    }


    @DeleteMapping("/eliminar")
    public String eliminar(@RequestParam("id") Long id){
        alumnoService.eliminar(id);
        return "redirect:/alumno";
    }




}
