package org.extjsf.tags;

import java.util.List;

import javax.faces.component.FacesComponent;
import javax.faces.component.UICommand;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent(value = "org.extjsf.tags.Handler", namespace = "http://extjsf.org/ui", tagName = "handler", createTag = true)
public class Handler extends UICommand {

	public String getName(){
		return (String) this.getStateHelper().eval("name", "defaultHandler");
	}
	
	public void setName(String name){
		this.getStateHelper().put("name", name);
	}
	
	public String getServerAction(){
		return (String) this.getStateHelper().eval("serverAction", null);
	}
	
	public void setServerAction(String action){
		this.getStateHelper().put("serverAction", action);
	}
	
	@Override
	public String getFamily() {
		return "org.extjsf.controllerBehavior";
	}

	@Override
	public void encodeBegin(FacesContext context) throws java.io.IOException {
		ResponseWriter w = context.getResponseWriter();
		if(this.getServerAction() != null){
			//We have an action this means we need to have a form as an ancestor
			
			//code to check for an ancestor form
			
			//We now get the variable names used in the action expression
			for(String paramName : parseActualParameters(this.getServerAction())){
				w.startElement("input", this);
				w.writeAttribute("type", "hidden", null);
				w.writeAttribute("name", this.getClientId() + "-" + paramName, paramName);
			}
		}
		
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws java.io.IOException {
		ResponseWriter w = context.getResponseWriter();
	}
	
	private static List<String> parseActualParameters(String expression){
		System.out.println("Got: " + expression);
		return null;
	}
}
