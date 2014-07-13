package org.extjsf;

public abstract class ExtObject<T> {

	public T addAlias(String value){
		return this.add("alias", value);
	}

	@SuppressWarnings("unchecked")
	public T add(String key, String value){
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T add(String key, int value){
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T add(String key, boolean value){
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T add(String key, ExtConstant value){
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T add(String key, ExtObject<?> value){
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T add(String key, ExtMethod value){
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T addInline(String key, String params, ExtJSObject js){
		return (T) this;
	}
	
	public T addInline(String key, ExtJSObject js){
		return this.addInline(key, null, js);
	}
	
	@SuppressWarnings("unchecked")
	public T addVariable(String key, String var){
		return (T) this;
	}
}
