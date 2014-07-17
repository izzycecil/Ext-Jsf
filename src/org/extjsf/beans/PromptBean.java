package org.extjsf.beans;

import java.io.Serializable;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named("PromptBean")
@ViewScoped
public class PromptBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4144333263475523173L;
	
	private String text = null;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
