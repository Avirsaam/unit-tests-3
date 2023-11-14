package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticated) {
            data.add(user);
        }
    }

    public int logoutAllExceptAdmins(){
        List<User> newData = new ArrayList<>();
        for (User user: data) {
            if (user.isAdmin()){
                newData.add(user);
            } else {
                user.logout();
            }
            data = newData;
        }
        return data.size();
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}