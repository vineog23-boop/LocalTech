package br.com.fiap.localtech.localtech.entities;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Aluguel {

    private Long id;
    private Long pessoaId;
    private Long veiculoId;
    private String veiculoModelo;
    private String pessoaLocadorCpf;
    private String pessoaLocadorNome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private BigDecimal valorTotal;

}
