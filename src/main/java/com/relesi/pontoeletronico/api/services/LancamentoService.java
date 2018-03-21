package com.relesi.pontoeletronico.api.services;

import com.relesi.pontoeletronico.api.entities.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

/**
 * Created by Renato on 21/03/2018.
 */
public interface LancamentoService {

    /**
     * Retorna um lista paginada de lancamentos de um determinado funcionário
     * @param funcionarioId
     * @param pageRequest
     * @return Page<lancamento>
     */
    Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);

    /**
     * Retorna um lancamento por ID
     * @param id
     * @return Optional<lancamento>
     */

    Optional<Lancamento> buscarPorId(Long id);

    /**
     * Persiste um lancamento na base de dados.
     *
     * @param lancamento
     * @return Lancamento
     */
    Lancamento persistir(Lancamento lancamento);

    /**
     * Remove um lancamento da base de dados.
     *
     * @param id
     */
    void remover(Long id);


}
