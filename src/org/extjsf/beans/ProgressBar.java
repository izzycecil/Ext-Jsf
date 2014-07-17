package org.extjsf.beans;

import java.io.Serializable;

import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@Named("ProgressBar")
@ViewScoped
public class ProgressBar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3325100787973540214L;

	private Integer progress = 0;
	private Integer wait = 0;

	public Integer getProgress() {

		progress = progress + (int)(Math.random() * 35);

		if(progress > 100){
			progress = 100;
		}
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public void onComplete(String type){
		if("data".equals(type)){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Complete", "Your fake data was saved."));
		}else if("items".equals(type)){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Complete", "Your fake items were loaded."));
		}
	}

	public Integer getWait() {
		progress = progress + (int)(Math.random() * 15);

		if(progress >= 100){
			progress = 0;
			wait++;
		}
		if(wait >= 4){
			return 100;
		}
		return progress;
	}

	public void setWait(Integer wait) {
		this.wait = wait;
	}
}
