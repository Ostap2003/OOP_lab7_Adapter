package sender;

import user.User;

import java.util.Date;

public class MessageSender {
    private int hourInMilisec = 3600000;

    // if user is from given country and was active at most a hour ago, then send the message
    public boolean send(String text, User user, String country){
        Date now = new Date();

        // compare dates
        if (now.getTime() - user.getActiveTime().getTime() <= hourInMilisec){

            // compare countries
            if (user.getCountry() == country){
                System.out.println("Message has been sent to " + user + "; [location: " + country + "]");
                return true;
            }
        }
        // if message hasn't been sent
        return false;
    }
}
