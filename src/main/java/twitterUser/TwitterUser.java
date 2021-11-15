package twitterUser;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;

    public String getUserMail(){
        return this.userMail;
    }

    public String getCountry(){
        return this.country;
    }

    public Date getLastActiveTime(){
        return this.lastActiveTime;
    }
}
