package citi.com.domain;

public class MessageData {
	private String refnum;
    private String message;
    public MessageData(String refnum, String message) {       
        this.refnum = refnum;
        this.message = message;
    }

    
	public String getRefnum() {
		return refnum;
	}
	public void setRefnum(String refnum) {
		this.refnum = refnum;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
