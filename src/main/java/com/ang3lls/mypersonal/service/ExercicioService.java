package com.ang3lls.mypersonal.service;

import com.ang3lls.mypersonal.model.Exercicio;
import com.ang3lls.mypersonal.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioService {

    @Autowired
    private ExercicioRepository exercicioRepository;

    public void createExercicio(Exercicio exercicio) {
        exercicioRepository.save(exercicio);
    }

    public List<Exercicio> listExercicios() {
        return exercicioRepository.findAll();
    }

    public void updadeExercicio(Integer id, Exercicio exercicio) {
        Exercicio exist = exercicioRepository.findById(id).orElseThrow();
        exist.setNome(exercicio.getNome());
        exist.setCategoria(exercicio.getCategoria());
        exist.setFoco(exercicio.getFoco());
        exist.setDescricao(exercicio.getDescricao());
        exist.setDificuldade(exercicio.getDificuldade());
        exist.setFoto(exercicio.getFoto());
        exist.setVideo(exercicio.getVideo());
        exercicioRepository.save(exist);
    }
}
