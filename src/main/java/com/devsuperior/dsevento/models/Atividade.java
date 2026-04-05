package com.devsuperior.dsevento.models;

import jakarta.persistence.*;
import jakarta.servlet.http.Part;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_PARTICIPANTE")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(columnDefinition = "TEXT")
    private String descricao;
    private Double preco;

    private Categoria categoria;

    private List<Bloco> blocos = new ArrayList<>();

    private List<Participante> participantes = new ArrayList<>();
}
