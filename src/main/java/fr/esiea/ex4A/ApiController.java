package fr.esiea.ex4A;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ApiController {
    private final ApiRepository apiRepository;
    private final ApiService apiService;
    public ApiController(ApiService apiService,ApiRepository apiRepository) {
        this.apiService = apiService;
        this.apiRepository=apiRepository;
    }
    final HashMap<String, String> userValue = new HashMap<String, String>();
    @PostMapping(path="/api/inscription")
    void inscription(@RequestBody UserInfo userInfo) throws InterruptedException {
            userValue.put("userCountry", userInfo.userCountry);
            userValue.put("userEmail", userInfo.userEmail);
            userValue.put("userName", userInfo.userName);
            userValue.put("userSex", userInfo.userSex);
            userValue.put("userSexPref", userInfo.userSexPref);
            userValue.put("userTweeter", userInfo.userTweeter);
            System.out.println(userValue);
            System.out.println(userInfo);
        }
            UserData sayHello (@RequestParam(name = "name", required = false) String userName, String
            userCountry, String userTweeter){
                final UserData userData;
                if (userName.equals(userValue.get(userName))) {
                    userData = apiRepository.getUserDataFor(userName, userTweeter);
                } else {
                    userData = null;
                }
                return userData;
            }
            @GetMapping("/api/matches")
            List<UserData> matches () {
                return List.of(
                    new UserData("titi","mouking"),
                    new UserData("tutu","tata")

                );

            }

        }









