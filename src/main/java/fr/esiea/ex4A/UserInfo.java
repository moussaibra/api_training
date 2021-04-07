package fr.esiea.ex4A;

import com.fasterxml.jackson.annotation.JsonProperty;
<<<<<<< HEAD
import java.util.Objects;
=======
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

>>>>>>> origin/main
public class UserInfo {
    public final String userCountry;
    public final String userName;
    public final String userEmail;
    public final String userTweeter;
    public final String userSex;
    public final String userSexPref;
    public UserInfo(@JsonProperty("userCountry") String userCountry,
                    @JsonProperty("userName") String userName,
                    @JsonProperty("userEmail") String userEmail,
                    @JsonProperty("userTweeter") String userTweeter,
                    @JsonProperty("userSex") String userSex,
                    @JsonProperty("userSexPref") String userSexPref) {
        this.userCountry = userCountry;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userTweeter = userTweeter;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
    }
    @Override
    public String toString() {
        return "UserInfo{" + "userCountry:'" + userCountry + '\'' + ", userName:'" + userName + '\'' + ", userEmail:'" + userEmail + '\'' + ", Tweeter:'" + userTweeter + '\'' +
            ", userSex:'" + userSex + '\'' +
            ", userSexPref:'" + userSexPref + '\'' +
            '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;UserInfo userInfo = (UserInfo) o;
        return Objects.equals(userCountry, userInfo.userCountry) && Objects.equals(userName, userInfo.userName) && Objects.equals(userEmail, userInfo.userEmail) && Objects.equals(userTweeter, userInfo.userTweeter) && Objects.equals(userSex, userInfo.userSex) && Objects.equals(userSexPref, userInfo.userSexPref);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userCountry, userName, userEmail, userTweeter, userSex, userSexPref); }}

