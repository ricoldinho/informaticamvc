package edu.rico.alumnos.mvc.services;

import java.util.List;

import org.hibernate.query.sqm.EntityTypeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.rico.alumnos.mvc.entities.Alumno;
import edu.rico.alumnos.mvc.entities.Asignatura;
import edu.rico.alumnos.mvc.repositories.IAlumnoRepository;
import edu.rico.alumnos.mvc.repositories.IAsignaturaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private IAlumnoRepository alumnoRepository;

    @Autowired
    private IAsignaturaRepository asignaturaRepository;


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


    @Override
    public void deleteAlumno(Long id) {
        alumnoRepository.deleteById(id);
    }


    @Override
    public void deleteAsignaturaDeAlumno(Long idAlumno, Long idAsignatura) {
       
    }
	
}
