package mainpackage;

public class Users {
    private String username;
    private String password;
    private String name;
    private String surname;
    static int usersCounter;

    public Users(String u,String p,String n ,String s ) {
        this.username=u;
        this.password=p;
        this.name=n;
        this.surname=s;
        usersCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void logIn(){

    }

    public void logOut(){

    }
}
