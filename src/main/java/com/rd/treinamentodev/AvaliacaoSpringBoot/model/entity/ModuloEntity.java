package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TB_MODULO")
@Data

public class ModuloEntity   {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MODULO")
    private BigInteger idModulo;

    @Column(name = "DS_NOME")
    private String nomeModulo;

    @ManyToOne
    @JoinColumn(name = "ID_INSTRUTOR")
    private InstrutorEntity instrutor;


}
