package fr.esiea.ex4A;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
class ApiController {
    private final ApiService apiService;

    ApiController(ApiService apiService) {
        this.apiService = apiService;
    }
    @PostMapping(path="/api/inscription")
    void inscription(@RequestBody UserInfo userInfo) throws InterruptedException{
        HashMap<String, String> userValue = new HashMap<String, String>();
        userValue.put("userCountry", userInfo.userCountry);
        userValue.put("userEmail", userInfo.userEmail);
        userValue.put("userName", userInfo.userName);
        userValue.put("userSex", userInfo.userSex);
        userValue.put("userSexPref", userInfo.userSexPref);
        userValue.put("userTweeter", userInfo.userTweeter);
        System.out.println(userValue);
        System.out.println(userInfo);

    }

    @GetMapping("/api/matches")
    List<UserData> matches() {
        return List.of(
            new UserData("titi", "machin"),
            new UserData("tutu", "bidule")
        );
        }



}
