package br.com.poc.struts2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.poc.struts2.model.Funcionario;

@Repository
public class HibernateFuncionarioDao implements FuncionarioDao {

	private HibernateTemplate template;
	
	@Autowired
	public HibernateFuncionarioDao(HibernateTemplate template) {
		this.template = template;
	}

	public Funcionario find(Long id) {
		return template.get(Funcionario.class, id);
	}
}
