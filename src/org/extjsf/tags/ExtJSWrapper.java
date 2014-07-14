package org.extjsf.tags;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent(value = "org.extjsf.tags.ExtJSWrapper", namespace = "http://extjsf.org/ui", tagName = "ExtJSWrapper", createTag = true)
public class ExtJSWrapper extends UIComponentBase {
	@Override
	public String getFamily() {
		return "ExtJSF";
	}

	@Override
	public void encodeBegin(FacesContext context) throws java.io.IOException {
		ResponseWriter w = context.getResponseWriter();
		
		w.startElement("script", this);
		w.writeAttribute("id", this.getClientId(), null);
		w.writeText(this.getClientId() + "();", null);
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws java.io.IOException {
		ResponseWriter w = context.getResponseWriter();
		
		w.endElement("script");
	}
}
