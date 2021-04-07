package fr.esiea.ex4A;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class UserData {
    public final String userName;
    public final String userTweeter;


    public UserData(String name, String twitter) {
        this.userName = name;
        this.userTweeter = twitter;
    }



}
