package com.ang3lls.mypersonal.controller;

import com.ang3lls.mypersonal.model.Exercicio;
import com.ang3lls.mypersonal.service.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {

    @Autowired
    private ExercicioService exercicioService;

    @PostMapping
    private void createExercicio(@RequestBody Exercicio exercicio) {
        exercicioService.createExercicio(exercicio);
    }

    @GetMapping
    private List<Exercicio> exercicioList() {
        return exercicioService.listExercicios();
    }

    @PutMapping("/{id}")
    private void updateExercicio(@PathVariable Integer id, @RequestBody Exercicio exercicio) {
        exercicioService.updadeExercicio(id, exercicio);
    }
}
