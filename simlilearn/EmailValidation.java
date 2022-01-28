package simlilearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
private Pattern regexPattern;
private Matcher regMatcher;

public String validateEmailAddress(String emailAddress) {

    regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
    regMatcher   = regexPattern.matcher(emailAddress);
    if(regMatcher.matches()) {
        return "Valid Email Address";
    } else {
        return "Invalid Email Address";
    }
}




public static void main(String[] args) {

    String emailAddress = "murtizapurkarrohan@gmail.com";
   
    EmailValidation validations = new EmailValidation();
    System.out.println(validations.validateEmailAddress(emailAddress));
   
}
}
