package edu.rico.alumnos.mvc.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.rico.alumnos.mvc.entities.Alumno;
import edu.rico.alumnos.mvc.entities.enumerated.Disposicion;
import edu.rico.alumnos.mvc.entities.enumerated.Genero;

@Service
public class AlumnoService implements IAlumnoService {

    


    @Override
    public List<Alumno> getAlumnos() {
        Alumno alumno1 = new Alumno("Juan", "Perez", "Garcia", LocalDate.of(1990, 1, 1), Genero.HOMBRE, Disposicion.TRABAJADOR, "passport1.png");
        Alumno alumno2 = new Alumno("Maria", "Gonzalez", "Lopez", LocalDate.of(1995, 2, 2), Genero.MUJER, Disposicion.AUSENTE, "passport2.png");
        Alumno alumno3 = new Alumno("Pedro", "Martinez", "Sanchez", LocalDate.of(2000, 3, 3), Genero.HOMBRE, Disposicion.TRABAJADOR, "passport3.png");
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        return alumnos;
    }
	
}
