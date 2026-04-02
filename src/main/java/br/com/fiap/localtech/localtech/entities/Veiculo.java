package br.com.fiap.localtech.localtech.entities;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Veiculo {

    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private String cor;
    private BigInteger valorDiaria;
}
