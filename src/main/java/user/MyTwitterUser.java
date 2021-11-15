// ADAPTER FOR TWITTER USER

package user;

import twitterUser.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User{
    private TwitterUser adapteeTwitterUser;

    public MyTwitterUser(TwitterUser user){
        this.adapteeTwitterUser = user;
    }

    @Override
    public String getMail() {
        return adapteeTwitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return adapteeTwitterUser.getCountry();
    }

    @Override
    public Date getActiveTime() {
        return adapteeTwitterUser.getLastActiveTime();
    }
}
