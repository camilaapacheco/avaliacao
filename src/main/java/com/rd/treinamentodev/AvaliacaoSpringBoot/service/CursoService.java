package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class CursoService {
    @Autowired  private CursoRepository repository;

    public String cadastrarCurso(CursoDTO curso) {
        CursoEntity cursoEntity = new CursoEntity();

        cursoEntity.setNomeCurso(curso.getNomeCurso());
        cursoEntity.setNrCargaHoraria(curso.getNrCargaHoraria());

        repository.save(cursoEntity);

        return "Cadastro feito com sucesso!";

    }


}
