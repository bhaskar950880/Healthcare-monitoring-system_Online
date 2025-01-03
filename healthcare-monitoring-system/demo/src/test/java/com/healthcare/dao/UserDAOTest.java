package com.healthcare.dao;

import com.healthcare.models.User;
import com.healthcare.util.DBConnection;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserDAOTest {

    private UserDAO userDAO;

    @BeforeAll
    public void setUp() {
        userDAO = new UserDAO();
    }

    @BeforeEach
    public void cleanDatabase() {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM users")) {
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegisterUser() {
        userDAO.registerUser("John Doe", "john.doe@example.com", "1234567890");
        User user = userDAO.getUserById(1); // Assuming auto-increment starts from 1
        assertNotNull(user, "User should be registered and retrievable");
        assertEquals("John Doe", user.getUsername());
    }

    @Test
    public void testGetUserById_NotFound() {
        User user = userDAO.getUserById(999); // Non-existent ID
        assertNull(user, "User with non-existent ID should return null");
    }
}
