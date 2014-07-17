package org.extjsf.beans;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

@Named("jsfExampleDialogController")
@SessionScoped
public class jsfExampleDialogController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8190520157229047197L;

	@Inject
	private PromptBean prompt;
	
	@Inject
	private MulitBean multi;
	
	@Inject
	private SelectBean select;
	
	public void confirm(String type){
		showResult(type);
	}
	
	public void prompt(String type){
		showResultText(type, prompt.getText());
	}
	
	public void multi(String type){
		showResultText(type, multi.getText());
	}
	
	public void icon(){
		Severity type = null;
		String value = select.getValue();
		switch(value){
		case "error":
			type = FacesMessage.SEVERITY_ERROR;
			break;
		case "info":
			type = FacesMessage.SEVERITY_INFO;
			break;
		case "fatal":
			type = FacesMessage.SEVERITY_FATAL;
			break;
		case "warning":
			type = FacesMessage.SEVERITY_WARN;
			break;
		}
		RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(type, "Icon Support", "Here is a JSF message with an icon!"));
	}
	
	public static void showResult(String btn){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "You clicked the " + btn + " button."));
	}
	
	public static void showResultText(String btn, String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "You clicked the " + btn + " button with the text: " + msg));
	}
}
