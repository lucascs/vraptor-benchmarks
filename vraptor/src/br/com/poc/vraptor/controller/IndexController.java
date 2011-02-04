package br.com.poc.vraptor.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.poc.vraptor.service.FuncionarioService;

@Resource
public class IndexController {

	private final Result result;

	private final FuncionarioService service;

	public IndexController(Result result, FuncionarioService service) {
		this.result = result;
		this.service = service;
	}

	@Path("/")
	public void index() {
		result.include("funcionario", service.busca(1L));
	}
}
