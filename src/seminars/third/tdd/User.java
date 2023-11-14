package seminars.third.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticated = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public boolean authenticate(String name, String password){
        if (name.equals(this.name) && password.equals(this.password))
            return isAuthenticated = true;
        else
            return isAuthenticated = false;
    }

    public boolean logout(){
        return isAuthenticated = false;
    };

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isAuthenticated(){
        return isAuthenticated;
    }
}