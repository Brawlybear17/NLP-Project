// Main class to run the password checking program
public class NLPRunner {
  public static void main(String[] args) {
    // Create a PasswordChecker object

    PasswordChecker checker = new PasswordChecker();

    checker.loadPasswords();   // load passwords from file
    checker.prompt();          // ask user for password
    checker.checkStrength();   // check it
    checker.printSummary();    // print result

  }
}