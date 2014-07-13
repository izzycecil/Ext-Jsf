package org.extjsf.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("ExampleBean2")
@SessionScoped
public class ExampleBean2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5726243459231229267L;

	public int otherMethod(int i){
		return i+1;
	}
}
