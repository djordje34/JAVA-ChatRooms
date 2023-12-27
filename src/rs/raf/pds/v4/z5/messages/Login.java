package rs.raf.pds.v4.z5.messages;

public class Login {
	String userName;
	
	protected Login() {
		
	}
	public Login(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
}
