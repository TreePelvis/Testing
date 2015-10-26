public class PasswordValidator {
    private String password;

    public PasswordValidator(String password) {
        if(containsCapitalLetter(password) && containsCorrectCharacterLength(password))
            this.password = password;
        else throw new IllegalArgumentException("invalid password: " + password);
    }

    public String getPassword() {
        return password;
    }

    public boolean containsCapitalLetter(String password) {
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch))
                return true;
        }
        return false;
    }

    public boolean containsCorrectCharacterLength(String password) {
        if(password.length() > 5 && password.length() < 16)
            return true;

        return false;
    }
}