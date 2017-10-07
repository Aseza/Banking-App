package classes;

import org.springframework.stereotype.Component;

@Component
public class AjaxResponse {
	private String message;
	private String info;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}


}
