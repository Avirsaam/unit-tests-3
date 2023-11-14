package seminars.third.tdd;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    private UserRepository repository;

    @BeforeEach
    void setUp(){
        repository = new UserRepository();

        for (int i = 0; i < 4; i++) {
            String username = "name" + i;
            String password = "password" + i;
            boolean admin = false;

            if (i < 2){
                admin = true;
            }

            User thisUser = new User(username, password, admin);
            thisUser.authenticate(username, password);

            repository.addUser(thisUser);
        }


    }

    @Test
    @DisplayName("Проверка метода на разлогинивание всех кроме админов")
    void logoutAllExceptAdmins() {
        assertEquals(2, repository.logoutAllExceptAdmins(), "Ошибка метода на разлогинивание всех, кроме админов" );
    }
}