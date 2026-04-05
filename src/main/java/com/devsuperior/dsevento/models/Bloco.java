package com.devsuperior.dsevento.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TB_PARTICIPANTE")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inicio;

    private LocalDate fim;

    private Atividade atividade;
}
