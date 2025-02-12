package edu.rico.alumnos.mvc.controllers.mvccontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.rico.alumnos.mvc.services.IMatriculaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    IMatriculaService matriculaService;

    @GetMapping("/list")
    public String listarMatriculas(Model model) {
        model.addAttribute("matriculas", matriculaService.listarMatriculas());
        return "/matriculas/matriculasindex.html";
    }
    

    @GetMapping("/eliminar/{id}")
    public String eliminarMatricula(@PathVariable("id") Long id) {
        matriculaService.eliminarMatricula(id);
        return "redirect:/matriculas/list";
    }
    


}
