package org.example;


public class User {
    private String login;
    private String Email;

    public User(String login, String Email) {
        this.login = login;
        this.Email = Email;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return Email;
    }

    public boolean checkEmail(String Email) {
        return Email.contains("@") & Email.contains(".");
    }
}
