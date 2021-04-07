package fr.esiea.ex4A;

<<<<<<< HEAD
=======
import org.springframework.stereotype.Repository;
>>>>>>> origin/main
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class UserData {
    public final String userName;
    public final String userTweeter;
<<<<<<< HEAD

=======
>>>>>>> origin/main

    public UserData(String name, String twitter) {
        this.userName = name;
        this.userTweeter = twitter;
<<<<<<< HEAD
=======

    }
    UserData getUserDataFor(String name,String twitter) {

        return new UserData(name + ""  , twitter +"" );
>>>>>>> origin/main
    }



}
