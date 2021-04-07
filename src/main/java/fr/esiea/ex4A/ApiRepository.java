package fr.esiea.ex4A;

import fr.esiea.ex4A.hello.HelloData;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;


    @Repository
    class ApiRepository {
        final List<String> names = List.of(
            "Jaguabyss",
            "Coyolax",
            "Gazena",
            "Chickig",
            "Gladiabat",
            "Gladiafly",
            "Steeleen",
            "Marsharak",
            "Berriot",
            "Penguine"
        );
        private final Random random = new Random();

        /*UserData randomUser() {
            return new UserData(names.get(random.nextInt(names.size())));
        }*/

        UserData getUserDataFor(String name,String twitter) {

            return new UserData(name  , twitter );
        }

}
