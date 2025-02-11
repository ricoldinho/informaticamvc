package edu.rico.alumnos.mvc.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import edu.rico.alumnos.mvc.entities.Matricula;

public interface IMatriculaRepository extends JpaRepositoryImplementation<Matricula, Long>{

}
