package org.extjsf.beans;

import org.extjsf.ExtDictonary;
import org.extjsf.ExtMethod;
import org.extjsf.ExtViewController;

public class ExampleMessageBoxController extends ExtViewController {

	public ExampleMessageBoxController(){
		this.addAlias("controller.window-messagebox")
			.addInline("onConfirmClick", Ext.MessageBox.confirm("Confirm", "Are you sure you want to do that?", new ExtMethod(this, "showResult"), this))
			.addInline("onPromptClick", Ext.MessageBox.prompt("Name", "Please enter your name:", new ExtMethod(this, "showResultText"), this))
			.addInline("onMultiLinePromptClick", "btn", Ext.MessageBox.show(new ExtDictonary()
					.add("title", "Address")
					.add("msg", "Please enter your address:")
					.add("width", 300)
					.add("buttons", Ext.MessageBox.OKCANCEL)
					.add("multiline", true)
					.add("scope", this)
					.add("fn", new ExtMethod(this, "showResultText"))
					.addVariable("animateTarget", "btn")))
			.addInline("onYesNoCancelClick", "btn", Ext.MessageBox.show(new ExtDictonary()
					.add("title", "Save Changes?")
					.add("msg", "You are closing a tab that has unsaved changes. <br />Would you like to save your changes?")
					.add("buttons", Ext.MessageBox.YESNOCANCEL)
					.add("scope", this)
					.add("fn", new ExtMethod(this, "showResult"))
					.addVariable("animateTarget", "btn")
					.add("icon", Ext.MessageBox.QUESTION)));
	}
}
