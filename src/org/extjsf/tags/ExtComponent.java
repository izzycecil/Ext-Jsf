package org.extjsf.tags;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent(value = "org.extjsf.tags.ExtComponent", namespace = "http://extjsf.org/ui", tagName = "component", createTag = true)
public class ExtComponent extends UIComponentBase {

	@Override
	public String getFamily() {
		return "ExtJSF";
	}

	@Override
	public void encodeBegin(FacesContext context) throws java.io.IOException {
		ResponseWriter w = context.getResponseWriter();
		
		w.startElement("script", this);
		w.writeAttribute("id", this.getClientId(), null);
		w.writeText(this.getValue(), null);
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws java.io.IOException {
		ResponseWriter w = context.getResponseWriter();
		
		w.endElement("script");
	}

	public String getValue() {
		return (String) this.getStateHelper().eval("value", "default");
	}

	public void setValue(String v) {
		this.getStateHelper().put("value", v);
	}
	
	
}
