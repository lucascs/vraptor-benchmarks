package br.com.poc.struts2.controller;

import org.apache.struts2.config.Result;

import br.com.poc.struts2.model.Funcionario;
import br.com.poc.struts2.service.FuncionarioService;

import com.opensymphony.xwork2.Action;

@Result(name = Action.SUCCESS, value = "/jsp/index/index.jsp")
public class IndexAction implements Action {

	private final FuncionarioService service;
	private Funcionario funcionario;

	public IndexAction(FuncionarioService service) {
		this.service = service;
	}

	public String execute() throws Exception {
		this.funcionario = service.busca(1L);
		return SUCCESS;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
