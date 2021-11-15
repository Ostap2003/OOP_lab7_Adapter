package sender;

import facebookUser.FacebookUser;
import twitterUser.TwitterUser;
import user.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class MessageSenderTest {
    // dates
    private Date now;
    private Date oldDate;

    // sender
    private MessageSender sender;

    // adapters
    private MyFacebookUser fbAdapter;
    private MyTwitterUser twAdapter;
    private MyTwitterUser twAdapterOld;

    @BeforeEach
    void setUp() {
        this.now = new Date();
        this.sender = new MessageSender();

        FacebookUser fbUser = new FacebookUser("fbusr@gmail.com", "Ukraine", now);
        this.fbAdapter = new MyFacebookUser(fbUser);

        TwitterUser twUser = new TwitterUser("twusr@gmail.com", "Italy", now);
        this.twAdapter = new MyTwitterUser(twUser);

        // create User that was active 2 hours ago
        this.oldDate = new Date();
        oldDate.setHours(oldDate.getHours() - 2);
        TwitterUser twUserOld = new TwitterUser("twusr@gmail.com", "Italy", oldDate);
        this.twAdapterOld = new MyTwitterUser(twUserOld);
    }

    @Test
    void send() {
        assertEquals(true, sender.send("Hello world!", fbAdapter, "Ukraine"));
        assertEquals(true, sender.send("Hello world!", twAdapter, "Italy"));

        // the country is invalid
        assertEquals(false, sender.send("Hello", fbAdapter, "Germany"));
        // user was active 2 hrs ago, don't send
        assertEquals(false, sender.send("Hello", twAdapterOld, "Italy"));
    }
}