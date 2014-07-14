package org.extjsf;

import org.extjsf.tags.ViewController;

public class ExtViewController extends ExtObject<ExtViewController> {

	private ViewController viewControllerUI;
	
	public ExtViewController(){
		this.add("extend", "Ext.app.ViewController");
	}
	
	public ViewController getViewControllerUI() {
		return viewControllerUI;
	}

	public void setViewControllerUI(ViewController viewControllerUI) {
		this.viewControllerUI = viewControllerUI;
		this.viewControllerUI.setBoundBean(this);
	}
	
	public String render(){
		return "alert('pretend I am cool Ext.js code!');";
	}
}
