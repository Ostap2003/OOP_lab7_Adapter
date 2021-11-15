package adapter_db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    private DataBase db;

    @BeforeEach
    void setUp() {
        this.db = new DataBase();
    }

    @Test
    void getUserData() {
        assertEquals("hello", db.getUserData());
    }

    @Test
    void getStatisticalData() {
        assertEquals("hello2", db.getStatisticalData());
    }
}