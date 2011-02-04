package br.com.poc.vraptor.service;

import br.com.caelum.vraptor.ioc.Component;
import br.com.poc.vraptor.model.Funcionario;

@Component
public class SimpleFuncionarioService implements FuncionarioService {

	public SimpleFuncionarioService() {
	}

	public Funcionario busca(Long id) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Josa");
		funcionario.setId(id);
		funcionario.setSenha("asdfasf");
		funcionario.setUsuario("afsdfadf");
		funcionario.setEmail("DDDDD");
		return funcionario;
	}
}
