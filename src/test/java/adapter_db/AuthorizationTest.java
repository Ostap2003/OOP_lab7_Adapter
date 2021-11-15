package adapter_db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    private Authorization auth;

    @BeforeEach
    void setUp() {
        this.auth = new Authorization();
    }

    @Test
    void authorize() {
        DataBase db = new DataBase();
        assertEquals(true, auth.authorize(db));
    }
}