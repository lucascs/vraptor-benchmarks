package br.com.poc.vraptor.controller;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.core.MethodInfo;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;

public class HistoryInfoInterceptor implements Interceptor {

	private final MethodInfo info;

	public HistoryInfoInterceptor(MethodInfo info) {
		this.info = info;
	}

	public void intercept(InterceptorStack stack, ResourceMethod method, Object instance) throws InterceptionException {
		info.getParameters(); //os parametros (args) para o método

	}

	public boolean accepts(ResourceMethod arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}
