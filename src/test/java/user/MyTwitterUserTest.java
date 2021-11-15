package user;

import static org.junit.jupiter.api.Assertions.*;

import twitterUser.TwitterUser;
import java.util.Date;

class MyTwitterUserTest {
    private Date now;
    private TwitterUser twitterUser;
    private MyTwitterUser myTwitterAdapter;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.now = new Date();
        this.twitterUser = new TwitterUser("twitteruser@gmail.com", "Ukraine", now);
        this.myTwitterAdapter = new MyTwitterUser(twitterUser);
    }

    @org.junit.jupiter.api.Test
    void getMail() {
        assertEquals("twitteruser@gmail.com", myTwitterAdapter.getMail());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals("Ukraine", myTwitterAdapter.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getActiveTime() {
        assertEquals(now, myTwitterAdapter.getActiveTime());
    }
}