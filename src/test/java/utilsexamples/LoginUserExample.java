package utilsexamples;

public class LoginUserExample {
	
	private String name;
	private String user;
	private String password;
	private boolean tested;
	private int age;
	
	public LoginUserExample(String name, String user, String password, int age) {
		this.name = name;
		this.user = user;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getTested() {
		return tested;
	}

	public void setTested(boolean tested) {
		this.tested = tested;
	}
	
	public boolean login() {
		if(user.equals("nsysuser") && password.equals("x1y2z3A4")) {
			return true;
		}else {
			return false;
		}
	}
	
}
