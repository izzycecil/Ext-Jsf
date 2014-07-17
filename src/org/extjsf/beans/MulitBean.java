package org.extjsf.beans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("MultiBean")
@ViewScoped
public class MulitBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1205554657202141815L;

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
