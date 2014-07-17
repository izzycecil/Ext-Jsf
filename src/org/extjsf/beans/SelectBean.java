package org.extjsf.beans;

import java.io.Serializable;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named("SelectBean")
@ViewScoped
public class SelectBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3000522074107507846L;

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
