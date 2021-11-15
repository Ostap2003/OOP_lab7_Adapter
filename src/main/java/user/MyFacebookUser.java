// ADAPTER FOR FACEBOOK USER

package user;

import facebookUser.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User{
    private FacebookUser adapteeFacebookUser;

    public MyFacebookUser(FacebookUser user){
        this.adapteeFacebookUser = user;
    }

    @Override
    public String getMail() {
        return adapteeFacebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return adapteeFacebookUser.getUserCountry();
    }

    @Override
    public Date getActiveTime() {
        return adapteeFacebookUser.getUserActiveTime();
    }
}
