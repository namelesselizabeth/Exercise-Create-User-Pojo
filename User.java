package userPojo;

//Plain Old Java Object

public class User {

	@SuppressWarnings("unused")
	private String userName;
	@SuppressWarnings("unused")
	private String password;
	@SuppressWarnings("unused")
	private String name;
	
	public User (String userName, String password, String name) {
		
		this.userName = userName;
		this.password = password;
		this.name = name;
	}
}
