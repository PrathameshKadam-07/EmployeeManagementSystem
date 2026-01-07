package Bean;

import java.io.Serializable;

public class LoginBean implements Serializable{
   String uname;
   String pass;
   public LoginBean() 
   {
   }
   public LoginBean(String uname, String pass) 
   {
	this.uname = uname;
	this.pass = pass;
   }
   
   public String getUname() 
   {
	return uname;
   }
   
   public String getUpwd() {
	return pass;
   }
}
