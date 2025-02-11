package edu.rico.alumnos.mvc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false, targetEntity = Alumno.class)
    @JoinColumn(nullable = false)
    private Alumno alumno;
    @ManyToOne(optional = false, targetEntity = Asignatura.class)
    @JoinColumn(nullable = false)
    private Asignatura asignatura;
    @Column(nullable=false, name="curso", length = 5)
    private String curso;
    @Column(nullable = true, name="nota")
    private Double nota;

    public Matricula(){}


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Asignatura getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "Matricula [id=" + id + ", alumno=" + alumno.getNombre() + " " + alumno.getApellido1() + " " + alumno.getApellido2() + ", asignatura=" + asignatura.getAbreviatura() + ", curso=" + curso
                + ", nota=" + nota + "]";
    }

    
}
