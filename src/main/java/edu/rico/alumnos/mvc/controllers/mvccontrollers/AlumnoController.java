package edu.rico.alumnos.mvc.controllers.mvccontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.rico.alumnos.mvc.entities.Alumno;
import edu.rico.alumnos.mvc.services.IAlumnoService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private IAlumnoService alumnoService;

    @GetMapping("/list")
    public String listarAlumnos(Model model) {
        List<Alumno> alumnos = alumnoService.getAlumnos();
        model.addAttribute("alumnos", alumnos);
        return "alumnosindex";
    }

    @GetMapping("/form")
    public String desplegarFormulario() {
        return "alumnosform";
    }
    
    @PostMapping("/save")
    public String guardarAlumno(Alumno alumno) {
        System.out.println("ALUMNO GUARDADO => " + alumnoService.saveAlumno(alumno));
        return "redirect:/alumnos/list";
    }
    

    
}
