package rs.raf.pds.v4.z5.messages;

public class InfoMessage {
	String txt;
	
	protected InfoMessage() {
		
	}
	public InfoMessage(String txt) {
		this.txt = txt;
	}

	public String getTxt() {
		return txt;
	}
}
