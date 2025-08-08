
import java.util.*;
public class User {
    int userId;
    String userName;
    String userEmail;
    ArrayList<String> books=new ArrayList<>();
    
    ArrayList<User> userList=new ArrayList<>();
    
    public void addUser(User s) {
    	userList.add(s);
    }
    
    User(int userId, String userName, String userEmail, ArrayList<String> books){
    	this.userId=userId;
    	this.userName=userName;
    	this.userEmail=userEmail;
    	this.books=books;
    }
    
    User(){
    	
    }
    
}
