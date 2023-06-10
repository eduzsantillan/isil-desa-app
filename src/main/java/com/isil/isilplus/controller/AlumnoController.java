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
    public String home(Model model){
        model.addAttribute("alumnos",alumnoService.obtenerTodos());
        return "alumno/index";
    }

    @GetMapping("/detalle")
    public String obtenerPorId(@RequestParam Long id, Model model) {
        model.addAttribute("alumno",alumnoService.obtenerPorId(id));
        return "alumno/detalle";
    }

    @GetMapping("/editar")
    public String actualizar(@RequestParam Long id, Model model)  {
        model.addAttribute("alumno",alumnoService.obtenerPorId(id));
        return "alumno/editar";
    }

    @PostMapping("")
    public String guardar(@ModelAttribute("alumno") Alumno alumno){
        alumnoService.guardar(alumno);
        return "redirect:/alumno";
    }


    @PutMapping("")
    public String actualizar(@ModelAttribute("alumno") Alumno alumno){
        alumnoService.guardar(alumno);
        return "redirect:/alumno";
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable("id") Long id){
        alumnoService.eliminar(id);
        return "redirect:/alumno";
    }



}
