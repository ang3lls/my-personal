package com.ang3lls.mypersonal.controller;

import com.ang3lls.mypersonal.model.Categoria;
import com.ang3lls.mypersonal.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    private void createCategoria(@RequestBody Categoria categoria) {
        categoriaService.createCategoria(categoria);
    }

    @GetMapping
    private List<Categoria> listCategorias() {
        return categoriaService.listCategorias();
    }

    @PutMapping("/{id}")
    private void updateCategoria(@PathVariable Integer id, @RequestBody Categoria categoria) {
         categoriaService.updateCategoria(id, categoria);
    }
}
