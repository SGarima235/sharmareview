/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author USER
 */
public class pass {
   

  /**
   * Method to validate the password based on the rules:
   * 1. The password must be at least length 8
   * 2. The password must contain at least one "special character"
   *
   * @param password the password to validate
   * @return true if the password is valid, false otherwise
   */
  public boolean validatePassword(String password) {
    int specialCharCount = 0;

    // Iterate over each character to see if it is a special character
    for (int i = 0; i < password.length(); i++) {
      if (!(Character.isLetterOrDigit(password.charAt(i)))) {
        // Now we know there is at least one special character
        specialCharCount++;
      }
    }

    return specialCharCount > 0 && password.length() > 7;
  }
}

