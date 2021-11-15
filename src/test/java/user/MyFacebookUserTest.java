package user;

import facebookUser.FacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    private Date now;
    private FacebookUser fbUser;
    private MyFacebookUser myFbAdapter;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.now = new Date();
        this.fbUser = new FacebookUser("fbuser@gmail.com", "Ukraine", now);
        this.myFbAdapter = new MyFacebookUser(fbUser);
    }

    @org.junit.jupiter.api.Test
    void getMail() {
        assertEquals("fbuser@gmail.com", myFbAdapter.getMail());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals("Ukraine", myFbAdapter.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getActiveTime() {
        assertEquals(now, myFbAdapter.getActiveTime());
    }
}