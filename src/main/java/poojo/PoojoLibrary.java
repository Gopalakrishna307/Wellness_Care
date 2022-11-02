package poojo;

public class PoojoLibrary {
	String email;
	String name;
	String password;
	//String hospital;
	int id;
	public PoojoLibrary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PoojoLibrary(String email, String name, String password, int id) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
