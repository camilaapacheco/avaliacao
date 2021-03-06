package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TB_CURSO")
@Data
public class CursoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CURSO")
    private Long idCurso;

    @Column(name = "DS_CURSO")
    private String nomeCurso;

    @Column(name = "NR_CARGA_HORARIA")
    private Integer nrCargaHoraria;
}
