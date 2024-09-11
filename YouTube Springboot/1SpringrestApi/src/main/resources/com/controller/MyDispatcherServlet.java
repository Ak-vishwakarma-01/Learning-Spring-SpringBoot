package com.controller;

import java.io.ObjectInputFilter.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected class<?>[] getRootConfigClasses(){
		return null;
	}
	@Override
	protected class<?>[] getServletConfiClasses(){
		return Config;
	}
	@Override
	protected class<?>[] getServletMappings(){
		return new String("/ankit.com/*");
	}
}
