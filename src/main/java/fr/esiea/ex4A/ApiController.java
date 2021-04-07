package fr.esiea.ex4A;

<<<<<<< HEAD
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
=======
import org.springframework.http.MediaType;
>>>>>>> e840c3b (squash! teste numero 1)
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
<<<<<<< HEAD
class ApiController {
    private final ApiService apiService;

    ApiController(ApiService apiService) {
=======
public class ApiController {

    private final ApiRepository apiRepository;




    private final ApiService apiService;
    HashMap<String, String> userValue = new HashMap<String, String>();
    public ApiController(ApiService apiService,ApiRepository apiRepository) {
>>>>>>> f30805a (teste2)
        this.apiService = apiService;
    }
<<<<<<< HEAD
    @PostMapping(path="/api/inscription")
    void inscription(@RequestBody UserInfo userInfo) throws InterruptedException{
        HashMap<String, String> userValue = new HashMap<String, String>();
        userValue.put("England", "London");
        userValue.put("Germany", "Berlin");
        userValue.put("Norway", "Oslo");
        userValue.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(userInfo);
=======


    @PostMapping(path="/api/inscription")
    void inscription(@RequestBody UserInfo userInfo) throws InterruptedException{
<<<<<<< HEAD
>>>>>>> 40b2451 (Add API CONT)
=======

>>>>>>> e840c3b (squash! teste numero 1)
        userValue.put("userCountry", userInfo.userCountry);
        userValue.put("userEmail", userInfo.userEmail);
        userValue.put("userName", userInfo.userName);
        userValue.put("userSex", userInfo.userSex);
        userValue.put("userSexPref", userInfo.userSexPref);
        userValue.put("userTweeter", userInfo.userTweeter);
        System.out.println(userValue);
<<<<<<< HEAD
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
=======
        System.out.println(userInfo.toString());
>>>>>>> f30805a (teste2)
>>>>>>> e840c3b (squash! teste numero 1)

    }

    @GetMapping("/api/matches")
    List<UserData> matches() {
<<<<<<< HEAD
>>>>>>> 40b2451 (Add API CONT)
=======

>>>>>>> e840c3b (squash! teste numero 1)
        return List.of(
            new UserData("titi", "machin"),
            new UserData("tutu", "bidule")
        );
<<<<<<< HEAD
        }
=======
    }
<<<<<<< HEAD
<<<<<<< HEAD




=======
>>>>>>> 40b2451 (Add API CONT)
=======
public class ApiController {

>>>>>>> c16dd7d (Add API CONT)
=======

>>>>>>> f30805a (teste2)



>>>>>>> e840c3b (squash! teste numero 1)
}
