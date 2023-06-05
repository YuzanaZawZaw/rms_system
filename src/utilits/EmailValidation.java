package utilits;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*
* @author Yuzana Zaw Zaw
*/
public class EmailValidation {
	String email;
	
	public EmailValidation(String email){
		this.email=email;
	}
	private static final String regex = "^(.+)@(.+)$";
	public boolean validateEmail(){
		//initialize the Pattern object
	    Pattern pattern = Pattern.compile(regex);
	    //searching for occurrences of regex
	    Matcher matcher = pattern.matcher(getEmail());
	    Boolean flag=false;
	    flag=matcher.matches()? true : false;
		return flag;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
