package edu.rico.alumnos.mvc.services;

import java.util.List;

import edu.rico.alumnos.mvc.entities.Matricula;

public interface IMatriculaService {
    public void eliminarMatricula(Long id);
    public List<Matricula> listarMatriculas();
}
