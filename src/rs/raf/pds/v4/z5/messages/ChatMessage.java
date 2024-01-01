package rs.raf.pds.v4.z5.messages;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  


public class ChatMessage {
    private String user;
    private String txt;
    private String chatRoom;
    private String strDate;
    private String val;
    //time!!!
    private boolean reply = false;
    public boolean isStamped = false;
    public boolean noNeed = false;
    public ChatMessage() {

    }

    public ChatMessage(String user, String txt, String chatRoom) {
    	
    	Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
        strDate = dateFormat.format(date);  
        this.user = user;
        this.val = txt;
        this.txt = val + " ["+strDate+"]";
        this.chatRoom = chatRoom;
    }
public ChatMessage(String user, String txt, String chatRoom, boolean stamped) {
    	
    	Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
        strDate = dateFormat.format(date);  
        this.user = user;
        this.val = txt;
        if(!stamped) this.txt = val + " ["+strDate+"]";
        else this.txt = txt;
        this.chatRoom = chatRoom;
    }

    public String getUser() {
        return user;
    }
    public void setStamped(boolean b) {
    	isStamped = b;
    }
    
    public void setTxt(String txt) {
    	Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
        strDate = dateFormat.format(date);  
        this.val = txt;
        if (!isStamped)
        	this.txt = val + " ["+strDate+"]";
        else
        	this.txt = val;
    }
    public String getTxt() {
        return txt;
    }
    public void updateTxt(String txt) {
    	
    }

    public String getChatRoom() {
        return chatRoom;
    }
    public void setReply(boolean b) {
    	reply = b;
    }
    public boolean getReply() {
    	return reply;
    }
    
    public String format() {
    	return "("+this.getChatRoom()+") " + this.getUser()+(": ")+this.getTxt()+("\n");
    }
    
}
