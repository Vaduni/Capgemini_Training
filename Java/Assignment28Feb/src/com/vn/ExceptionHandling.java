package com.vn;
import java.util.HashMap;

		// TODO Auto-generated method stub
		//Create a subclass of class HashMap<String,String> which stores username and password. 
		//For this override the method put(key, value).
		//It throws an exception UsernameExistsException if some username is entered again.
class UsernameExistsException extends RuntimeException {
    public UsernameExistsException(String e) {
        super(e);
    }
}class SubMap extends HashMap<String, String> {
    @Override
    public String put(String username, String pass) {
        if (this.containsKey(username)) {
            throw new UsernameExistsException("Username exits alredy " + username);
        }
        return super.put(username, pass);
    }
}


public class ExceptionHandling {
	public static void main(String[] args) {

        SubMap users = new SubMap();

        try {
            users.put("vaduni", "11");
            users.put("niranjan", "22");
            users.put("vaduni", "newpass"); 
        } catch (UsernameExistsException e) {
            System.out.println("there is an exception "+e.getMessage());
        
		    
	}
	}
}
