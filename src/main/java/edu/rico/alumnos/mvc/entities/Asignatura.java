package edu.rico.alumnos.mvc.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 * TODO: CREAR UNA PLANTILLA PARA VISUALIZAR EN UNA TABLA LAS ASIGNATURAS asignaturasList.html
 * TENER UN FORMULARIO PARA GUARDAR UNA ASIGNATURA asignaturasForm.html
 * TENER UNA PLANTILLA PARA EDITAR UNA ASIGNATURA asignaturasEdit.html
 * QUE EN asignaturasList.html TENGAMOS UN BOTON "Ver alumnos" PARA CADA ASIGNATURA, SI PULSAMOS EL BOTON NOS LLEVARA
 * A asignaturasAlumnos.html donde veremos todos los alumnos que tienen esa asignatura en una CARD
 */
@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 155, nullable = false)
    private String nombre;
    @Column(name = "abreviatura", length = 5, nullable = false, unique = true)
    private String abreviatura;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "asignatura")
    private List<Matricula> matriculas; 
    
    public Asignatura() {
    }

    public Asignatura(String nombre, String abreviatura) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    @Override
    public String toString() {
        return "Asignatura [id=" + id + ", nombre=" + nombre + ", abreviatura=" + abreviatura + ", matriculas="
                + matriculas + "]";
    }

   

  
}
