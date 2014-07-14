package org.extjsf.tags;

import javax.faces.FacesException;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import org.extjsf.ExtViewController;

@FacesComponent(value = "org.extjsf.tags.ViewController", namespace = "http://extjsf.org/ui", tagName = "Ext.app.ViewController", createTag = true)
public class ViewController extends UIComponentBase {

	private ExtViewController parentBean;
	
	@Override
	public String getFamily() {
		return "ExtJSF";
	}

	@Override
	public void encodeBegin(FacesContext context) throws java.io.IOException {
		if(this.parentBean == null){
			throw new FacesException("Error binding bean is null, unable to render Ext.js code.");
		}
		ResponseWriter w = context.getResponseWriter();
		
		w.startElement("script", this);
		w.writeAttribute("id", this.getClientId(), null);
		w.writeAttribute("type", "text/javascript", null);
		w.writeText(parentBean.render(), null);
		w.endElement("script");
	}

	public void setBoundBean(ExtViewController bean){
		this.parentBean = bean;
	}
}
