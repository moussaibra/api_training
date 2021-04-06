package fr.esiea.ex4A;

<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ApiController {

    private final ApiRepository apiRepository;




    private final ApiService apiService;
    HashMap<String, String> userValue = new HashMap<String, String>();
    public ApiController(ApiService apiService,ApiRepository apiRepository) {
        this.apiService = apiService;
        this.apiRepository=apiRepository;
    }


    @PostMapping(path="/api/inscription")
    void inscription(@RequestBody UserInfo userInfo) throws InterruptedException{

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;

@RestController
 class ApiController {
    final HashMap<String, String> userValue = new HashMap<String, String>();
    @PostMapping(path="/api/inscription")
    void inscription(@RequestBody UserInfo userInfo) throws InterruptedException{
>>>>>>> 40b2451 (Add API CONT)
        userValue.put("userCountry", userInfo.userCountry);
        userValue.put("userEmail", userInfo.userEmail);
        userValue.put("userName", userInfo.userName);
        userValue.put("userSex", userInfo.userSex);
        userValue.put("userSexPref", userInfo.userSexPref);
        userValue.put("userTweeter", userInfo.userTweeter);
        System.out.println(userValue);
<<<<<<< HEAD
        System.out.println(userInfo.toString());

    }






    UserData sayHello(@RequestParam(name = "name", required = false) String userName, String userCountry , String userTweeter) {
        final UserData userData;

        if (userName.equals(userValue.get(userName))) {
            userData = apiRepository.getUserDataFor(userName,userTweeter);
        }
        else
        {
            userData=null;
        }

        return userData;
    }

    @GetMapping("/api/matches")
    List<UserData> matches() {

=======
        System.out.println(userInfo);
    }

    UserData sayHello(@RequestParam(name = "name", required = false) String userName, String userCountry , String userTweeter)
    { final UserData userData = null;
        if (userName.equals(userValue.get(userName))) {
             userData.getUserDataFor(userName,userTweeter);
        }
        else
        {
        }
        return userData;
    }
    @GetMapping("/api/matches")
    List<UserData> matches() {
>>>>>>> 40b2451 (Add API CONT)
        return List.of(
            new UserData(userValue.get("userName"), userValue.get("userTweeter")),
            new UserData(userValue.get("userName"), userValue.get("userTweeter"))
        );
    }
<<<<<<< HEAD




=======
>>>>>>> 40b2451 (Add API CONT)
=======
public class ApiController {

>>>>>>> c16dd7d (Add API CONT)
}
