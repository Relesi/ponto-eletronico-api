package com.relesi.pontoeletronico.api.utils;

import com.relesi.pontoeletronico.api.utils.PasswordUtils;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class PasswordUtilsTest {

    private static final String SENHA = "123456";
    private final BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();

    @Test
    public void testSenhaNula() throws Exception {
        assertNull(PasswordUtils.gerarBCrypt(null));
    }

    @Test
    public void testGerarHashSenha() throws Exception {
        String hash = PasswordUtils.gerarBCrypt(SENHA);

        assertTrue(bCryptEncoder.matches(SENHA, hash));
    }

}