package Ext;

import org.extjsf.ExtConstant;
import org.extjsf.ExtDictonary;
import org.extjsf.ExtMethod;
import org.extjsf.ExtJSObject;
import org.extjsf.ExtObject;

public class MessageBox {

	public static final ExtConstant OKCANCEL = new ExtConstant("Ext.MessageBox.OKCANCEL");
	public static final ExtConstant YESNOCANCEL = new ExtConstant("Ext.MessageBox.OKCANCEL");
	public static final ExtConstant QUESTION = new ExtConstant("Ext.MessageBox.OKCANCEL");
	
	public static ExtJSObject confirm(String title, String msg, ExtMethod callback, ExtObject<?> scope){
		return null;
	}
	
	public static ExtJSObject prompt(String title, String msg, ExtMethod callback, ExtObject<?> scope){
		return null;
	}
	
	public static ExtJSObject show(ExtDictonary data){
		return null;
	}
}
