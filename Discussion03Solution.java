class SignUpForm {
    String username;
    String password;

    SignUpForm(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*
        This method checks if the username field is correct. It
        returns "Ok" if the username field is not empty, and 
        "Username cannot be empty" otherwise.
    */
    String checkUsername() {
        // This should also work:
        // if (this.username.equals("")) {

        if (this.username.length() == 0) {        
           return "Username cannot be empty";
        }
        else {
            return "Ok";
        }
    }

    /*
        This method checks if the password field is correct. It
        returns "Ok" if so, otherwise it returns an String
        explaining the requirement it does not meet.
    */
    String checkPassword() {
        if (this.password.length() < 8) {
            return "Password must be at least 8 characters long.";
        }
        else if (!this.hasNumber(this.password)) {
            return "Password must contain at least one number (0-9).";            
        }
        else if (!this.hasSpecialCharacter(this.password)) {
            return "Password must contain at least one special character (!,#,$,*).";
        }
        else {
            return "Ok";
        }
    }

    /*
        This method accepts one String parameter, and returns
        true if that String contains a number.
    */
    boolean hasNumber(String str) {
        return str.contains("0") || 
            str.contains("1") || 
            str.contains("2") || 
            str.contains("3") || 
            str.contains("4") || 
            str.contains("5") || 
            str.contains("6") || 
            str.contains("7") || 
            str.contains("8") || 
            str.contains("9");
    }

    /*
        This method accepts one String parameter, and returns
        true if that String contains one of these special
        characters: !#$*
    */
    boolean hasSpecialCharacter(String str) {
        return str.contains("!") ||
            str.contains("#") || 
            str.contains("$") ||
            str.contains("*");
    }
}

class ExampleForms {
    SignUpForm goodForm = new SignUpForm("kas", "aG00dPa55word!");
    SignUpForm noUsernameForm = new SignUpForm("", "aBadU5ername!");
    SignUpForm noPasswordForm = new SignUpForm("kas", "");
    SignUpForm shortPasswordForm = new SignUpForm("kas", "!aB4567");
    SignUpForm noNumberForm = new SignUpForm("kas", "noNumbersOhNo!");
    SignUpForm noSCharForm = new SignUpForm("kas", "1W0ntEndWithAnExclaimation");

    // Tests for checkUsername method
    String goodUsername = this.goodForm.checkUsername();
    String badUsername = this.noUsernameForm.checkUsername();
    
    // Tests for checkPassword method
    String goodPassword = this.goodForm.checkPassword();
    String badPasswordOne = this.noPasswordForm.checkPassword();
    String badPasswordTwo = this.shortPasswordForm.checkPassword();
    String badPasswordThree = this.noNumberForm.checkPassword();
    String badPasswordFour = this.noSCharForm.checkPassword();
    
    // Tests for helper methods
    boolean hasNum = this.goodForm.hasNumber("abc1");
    boolean noNum = this.goodForm.hasNumber("abc");
    boolean hasSChar = this.goodForm.hasSpecialCharacter("a!c");
    boolean noSChar = this.goodForm.hasSpecialCharacter("abc");
}