package br.com.fiap.localtech.localtech.repository;

import br.com.fiap.localtech.localtech.entities.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoRepository {


    //Assinaturas dos Métodos na Interface Repository
    Optional<Veiculo> findById(Long id);
    List<Veiculo> findAll(int size, int offset);
    Integer save(Veiculo veiculo);
    Integer update(Veiculo veiculo, Long id);
    Integer delete(Long id);
}
