package facebookUser;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;

    public String getEmail(){
        return this.userMail;
    }

    public String getUserCountry(){
        return this.country;
    }

    public Date getUserActiveTime(){
        return this.lastActiveTime;
    }
}
