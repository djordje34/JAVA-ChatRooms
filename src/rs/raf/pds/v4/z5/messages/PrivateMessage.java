package rs.raf.pds.v4.z5.messages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrivateMessage{
    String user;
    String txt;
	private String recipient;
	private String strDate;
	
	public PrivateMessage() {
        super();
    }
	 public PrivateMessage(String user, String txt, String recipient) {
		 	Date date = Calendar.getInstance().getTime();  
	        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	        strDate = dateFormat.format(date);  
	        this.user = user;
	        this.txt = txt + " ["+strDate+"]";
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
