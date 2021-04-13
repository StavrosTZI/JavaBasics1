package mainpackage;

public class Users {
    private String username;
    private String password;
    private String name;
    private String surname;
    static int usersCounter;

    public Users(String u,String p,String n ,String s ) {
        this.name=u;
        this.password=p;
        this.name=n;
        this.surname=s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
