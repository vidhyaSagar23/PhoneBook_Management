package com.jsp.phonebook.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CustomDispactcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {BeanConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] c=new Class[] {ApplicationConfig.class};
		return c;
	}

	@Override
	protected String[] getServletMappings() {
		String s[]=new String[] {"/"};
		return s;
	}

}
