package main.java.model;
 
public class User {
 
    private String login;
    private String password;
	//private String password2;
	private int userid;
 
    public String getLogin() {
        return login;
    }
 
    public void setLogin(String login) {
        this.login = login;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
	/*public String getPassword2() {
        return password2;
    }
 
    public void setPassword2(String password2) {
        this.password2 = password2;
    }*/
	
	public int getUserId() {
        return userid;
    }
 
    public void setUserId(int userid) {
        this.userid = userid;
    }
}