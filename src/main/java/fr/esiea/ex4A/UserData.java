package fr.esiea.ex4A;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class UserData {
    ApiController apiController ;
    public final String userName;
    public final String userTweeter;

    public UserData(String name, String twitter) {
        this.userName = name;
        this.userTweeter = twitter;

    }
    @GetMapping("/api/matches")
    List<UserData> matches() {

        return List.of(
            new UserData(apiController.userValue.get(userName), apiController.userValue.get(userTweeter)),
            new UserData(apiController.userValue.get(userName), apiController.userValue.get(userTweeter))
        );
    };

}
