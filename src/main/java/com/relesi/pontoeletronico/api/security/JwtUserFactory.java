package com.relesi.pontoeletronico.api.security;


import com.relesi.pontoeletronico.api.entities.Funcionario;
import com.relesi.pontoeletronico.api.enums.PerfilEnum;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {

	private JwtUserFactory() {
	}

	/**
	 * Converte e gera um JwtUser com base nos dados de um funcionário.
	 *
	 * @param funcionario
	 * @return JwtUser
	 */
	public static com.relesi.pontoeletronico.api.security.JwtUser create(Funcionario funcionario) {
		return new com.relesi.pontoeletronico.api.security.JwtUser(funcionario.getId(), funcionario.getEmail(), funcionario.getSenha(),
				mapToGrantedAuthorities(funcionario.getPerfil()));
	}

	/**
	 * Converte o perfil do usuário para o formato utilizado pelo Spring Security.
	 *
	 * @param perfilEnum
	 * @return List<GrantedAuthority>
	 */
	private static List<GrantedAuthority> mapToGrantedAuthorities(PerfilEnum perfilEnum) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(perfilEnum.toString()));
		return authorities;
	}

}