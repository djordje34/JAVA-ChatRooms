package rs.raf.pds.v4.z5.messages;

public class ListUsers {
	String[] users;
	boolean checker = false;
	protected ListUsers() {
		
	}
	public ListUsers(String[] users) {
		this.users = users;
	}

	public String[] getUsers() {
		return users;
	}
	
	public void setChecker(boolean b) {
		checker = b;
	}
	
	public boolean getChecker() {
		return checker;
	}
}
