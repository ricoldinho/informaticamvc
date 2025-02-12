package edu.rico.alumnos.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.rico.alumnos.mvc.entities.Matricula;
import edu.rico.alumnos.mvc.repositories.IMatriculaRepository;

@Service
public class MatriculaService implements IMatriculaService{
    
    @Autowired
    private IMatriculaRepository matriculaRepository;

    @Override
    public void eliminarMatricula(Long id) {
        matriculaRepository.deleteById(id);
    }

    @Override
    public List<Matricula> listarMatriculas() {
        return matriculaRepository.findAll();
    }

}
