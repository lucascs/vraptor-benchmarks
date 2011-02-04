package br.com.poc.vraptor.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.caelum.vraptor.ioc.Component;
import br.com.poc.vraptor.model.Funcionario;

@Component
public class HibernateFuncionarioDao implements FuncionarioDao {

	private HibernateTemplate template;

	public HibernateFuncionarioDao(HibernateTemplate template) {
		this.template = template;
	}

	public Funcionario find(Long id) {
		return template.get(Funcionario.class, id);
	}
}
