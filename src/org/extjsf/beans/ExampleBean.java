package org.extjsf.beans;

import java.io.Serializable;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named("ExampleBean")
@SessionScoped
public class ExampleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6178886189342628033L;
	private String name = "default";
	
	public String simpleMethod(){
		return "foo";
	}
	
	public String randomMethod(String value1, int value2){
		return value1 + ": " + value2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
