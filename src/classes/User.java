package classes;

public class User {
  
  private String Username;
  private String Forename;
  private String Surname;
  private String Password;
  
  public User(String username, String forename, String surname, String password) {
    Username = username;
    Forename = forename;
    Surname = surname;
    Password = password;
  }
  
  public String getUsername() {
    return Username;
  }
  
  public String getFullName() {
    return Forename + " " + Surname;
  }
  
  public String getPassword() {
    return Password;
  }
}
