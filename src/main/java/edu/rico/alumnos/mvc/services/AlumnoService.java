package edu.rico.alumnos.mvc.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.rico.alumnos.mvc.entities.Alumno;
import edu.rico.alumnos.mvc.entities.enumerated.Disposicion;
import edu.rico.alumnos.mvc.entities.enumerated.Genero;
import edu.rico.alumnos.mvc.repositories.IAlumnoRepository;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private IAlumnoRepository alumnoRepository;


    @Override
    public List<Alumno> getAlumnos() {
        
        return alumnoRepository.findAll();
    }


    @Override
    public Alumno saveAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }


    @Override
    public Alumno getAlumnoById(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }
	
}
