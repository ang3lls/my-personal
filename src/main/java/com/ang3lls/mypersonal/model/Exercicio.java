package com.ang3lls.mypersonal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exercicio")
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String nome;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    Categoria categoria;
    String foco;
    String descricao;
    Integer dificuldade;
    String foto;
    String video;

    public Exercicio() {
    }

    public Exercicio(Integer id, String nome, Categoria categoria, String foco, String descricao, Integer dificuldade, String foto, String video) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.foco = foco;
        this.descricao = descricao;
        this.dificuldade = dificuldade;
        this.foto = foto;
        this.video = video;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getFoco() {
        return foco;
    }

    public void setFoco(String foco) {
        this.foco = foco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
