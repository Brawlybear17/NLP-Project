import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/* Class to handle password checking logic
 Stores user password and any issues found */
public class PasswordChecker {
  // Used to check if password is easily guessable
  private ArrayList<String> commonPasswords;
  // Stores reasons why password is weak
  private ArrayList<String> issues;
  // Input from the user
  private String userPassword;
 /* Constructor initializes lists
 Sets up storage for passwords and issues */
  public PasswordChecker() {
    commonPasswords = new ArrayList<String>();
    issues = new ArrayList<String>();
  }
  /* Load passwords from passwords.txt 
  Each line added to commonPasswords list */
  public void loadPasswords() {
    try {
      Scanner file = new Scanner(new File("passwords.txt"));
      while (file.hasNextLine()) {
      // Used later to check against user password
        commonPasswords.add(file.nextLine());
      }
      file.close();
       // Helps debug missing or bad file
    } catch (Exception e) {
      System.out.println("Error reading file");
    }
  }
  /* Ask user to enter a password 
  Store input in userPassword */
  public void prompt() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a password: ");
    userPassword = input.nextLine();
  }
  // Look for common problems
  public void checkStrength() {
    String lower = userPassword.toLowerCase();
        // Check if password is too common 
    if (commonPasswords.contains(lower)) {
      issues.add("Too common");
    }
    if (userPassword.length() < 8) {
      issues.add("Too short");
    }
    boolean hasNumber = false;
        // Required for stronger password
    for (int i = 0; i < userPassword.length(); i++) {
      if (Character.isDigit(userPassword.charAt(i))) {
        hasNumber = true;
      }
    }
    //add if no number found
    if (!hasNumber) {
      issues.add("Needs a number");
    }
  }
  /* Print a summary of password strength issues 
  Lists problems or confirms strong password */
  public void printSummary() {
    if (issues.size() == 0) {
      // if password is strong
      System.out.println("Strong password");
    } else {
      // if password is weak
      System.out.println("Weak password:");
      for (String issue : issues) {
        System.out.println("- " + issue);
      }
    }
  }
}