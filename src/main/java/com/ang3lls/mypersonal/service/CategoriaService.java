package com.ang3lls.mypersonal.service;

import com.ang3lls.mypersonal.model.Categoria;
import com.ang3lls.mypersonal.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void createCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    public List<Categoria> listCategorias() {
        return categoriaRepository.findAll();
    }

    public void updateCategoria(Integer id, Categoria categoria) {
        Categoria exist = categoriaRepository.findById(id).orElseThrow();
        exist.setNome(categoria.getNome());
        categoriaRepository.save(exist);
    }
}
