package com.relesi.pontoeletronico.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Renato on 09/03/2018.
 */
public class PasswordUtils {

    private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);

    public PasswordUtils(){

    }
    /**
     * Gera um hash utilizando p BCrypt.
     *
     * @param senha
     * @return String
     */

    public static String gerarBCrypt(String senha){
        if(senha == null){
            return senha;

        }
        log.info("Gerando hash com BCrypt");
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.encode(senha);
    }

}
