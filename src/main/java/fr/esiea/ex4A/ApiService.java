package fr.esiea.ex4A;


import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public String addTwitter(UserInfo userInfo) {
        return userInfo.userTweeter;
    }
    public String addUsername(UserInfo userInfo) { return userInfo.userName; }


}
