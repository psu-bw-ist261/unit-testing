package pointofsales.entities.testing.repositories;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pointofsales.entities.User;
import pointofsales.entities.repositories.UsersRepository;

public class UsersRepositoriesTests {
    @Test
    public void addUserShouldAddUser() {
        // Arrange
        User user = new User();
        user.setFirstName("Bob");
        user.setLastName("Barker");
        user.setLoginCode("123456");
        user.setId("1");

        UsersRepository usersRepository = new UsersRepository();

        // Act
        try {
            usersRepository.add(user);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        User actualUser = usersRepository.get("1");

        // Assert
        assertEquals(user, actualUser);
    }
}
