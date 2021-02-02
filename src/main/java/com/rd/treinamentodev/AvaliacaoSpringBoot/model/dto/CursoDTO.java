package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursoDTO {

    private Long idCurso;
    private String nomeCurso;
    private Integer nrCargaHoraria;

}
