package com.relesi.pontoeletronico.api.services;

import com.relesi.pontoeletronico.api.entities.Empresa;

import java.util.Optional;

/**
 * Created by Renato on 14/03/2018.
 */
public interface EmpresaService {

    /**
     * Retorna uma empresa dado um CNPJ.
     *
     * @param cnpj
     * @return Optional<Empresa>
     */

    Optional<Empresa> buscarPorCnpj(String cnpj);

    /**
     * Cadastra uma nova empresa na base de dados.
     *
     * @param
     * @return Empresa
     *
     */
    Empresa persistir(Empresa empresa);

}
