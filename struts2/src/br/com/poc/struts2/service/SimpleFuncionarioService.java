package br.com.poc.struts2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.poc.struts2.dao.FuncionarioDao;
import br.com.poc.struts2.model.Funcionario;

@Service
public class SimpleFuncionarioService implements FuncionarioService {

	private FuncionarioDao dao;

	@Autowired
	public SimpleFuncionarioService(FuncionarioDao dao) {
		this.dao = dao;
	}

	public Funcionario busca(Long id) {
		return dao.find(id);
	}
}
