package data;

import classes.*;

public class Login_Tester {
  private User[] ApplicationUsers;
  
  public Login_Tester() {
    ApplicationUsers = new User[3];
    ApplicationUsers[0] = new User("paulk", "Paul", "Kelly", "pass123");
    ApplicationUsers[1] = new User("johnsm", "John", "Smith", "john99");
    ApplicationUsers[2] = new User("davej", "David", "Jones", "jonesy21");
  }
  
  public User getUser(String username, String password) {
    User result = null;
    
    for (int i=0; i<ApplicationUsers.length; i++) {
      User currentUser = ApplicationUsers[i];
      
      if ((currentUser.getUsername() == username) && (currentUser.getPassword() == password)) {
        result = currentUser;
        i = ApplicationUsers.length;
      }
    }
    
    return result;
  }
}
