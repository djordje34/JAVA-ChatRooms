package rs.raf.pds.v4.z5.messages;

public class PrivateMessage{
    String user;
    String txt;
	private String recipient;
	
	public PrivateMessage() {
        super();
    }
	 public PrivateMessage(String user, String txt, String recipient) {
	        this.user = user;
	        this.txt = txt;
	        this.recipient = recipient;
	    }
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getUser() {
		return user;
	}

	public String getTxt() {
		return txt;
	}
}
