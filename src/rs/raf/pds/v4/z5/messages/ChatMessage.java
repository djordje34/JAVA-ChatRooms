package rs.raf.pds.v4.z5.messages;

public class ChatMessage {
    private String user;
    private String txt;
    private String chatRoom;
    private boolean reply = false;

    protected ChatMessage() {

    }

    public ChatMessage(String user, String txt, String chatRoom) {
        this.user = user;
        this.txt = txt;
        this.chatRoom = chatRoom;
    }

    public String getUser() {
        return user;
    }
    
    public void setTxt(String txt) {
    	this.txt = txt;
    }
    public String getTxt() {
        return txt;
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
    	return "("+this.getChatRoom()+") " + this.getUser()+(": ")+(this.getTxt())+("\n");
    }
    
}
