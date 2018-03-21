package com.relesi.pontoeletronico.api.services.impl;


import com.relesi.pontoeletronico.api.entities.Lancamento;
import com.relesi.pontoeletronico.api.repositories.LancamentoRepository;
import com.relesi.pontoeletronico.api.services.LancamentoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;


/**
 * Created by Renato on 21/03/2018.
 */
@Service
public class LancamentoServiceImpl implements LancamentoService {

    private static final Logger log =  LoggerFactory.getLogger(LancamentoServiceImpl.class);

    @Autowired
    private LancamentoRepository lancamentoRepository;


    public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
        log.info("Buscando lançamentos para o funcionário ID{}", funcionarioId);
        return this.lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
    }


    public Optional<Lancamento> buscarPorId(Long id) {
       log.info("Buscando um lançamento pelo ID{}", id);
        return Optional.ofNullable(this.lancamentoRepository.findOne(id));
    }


    public Lancamento persistir(Lancamento lancamento) {
        log.info("Persistindo o lançamento:{}", lancamento);
        return this.lancamentoRepository.save(lancamento);
    }


    public void remover(Long id) {
        log.info("Removendo o lancamento ID {}", id);
        this.lancamentoRepository.delete(id);

    }
}
