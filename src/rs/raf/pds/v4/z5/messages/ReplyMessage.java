package rs.raf.pds.v4.z5.messages;

public class ReplyMessage {
    private String user;
    private String txt;
    private ChatMessage repliedTo;

    public ReplyMessage() {
        super();
    }

    public ReplyMessage(String user, String txt, ChatMessage repliedTo) {
        this.user = user;
        this.txt = txt;
        this.repliedTo = repliedTo;
    }

    public String getUser() {
        return user;
    }

    public String getTxt() {
        return txt;
    }

    public ChatMessage getRepliedTo() {
        return repliedTo;
    }

    public void setRepliedTo(ChatMessage repliedTo) {
        this.repliedTo = repliedTo;
    }
}
