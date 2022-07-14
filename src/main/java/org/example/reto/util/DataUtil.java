package org.example.reto.util;

import org.example.reto.model.Email;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static List<String> getBadWords(){
        List<String> badWords = new ArrayList<>();
        badWords.add("loca");
        badWords.add("marica");
        badWords.add("castroso");
        badWords.add("pendejo");
        badWords.add("sapa");
        return badWords;
    }

    public static List<Email> getEmailList(){
        List<Email> resultEmail = new ArrayList<>();
        resultEmail.add(new Email("persona30@gmail.com","gmail", "si", false));
        resultEmail.add(new Email("persona29@sofka.com", "sofka", "no", false));
        resultEmail.add(new Email("persona28@outlook.com", "outlook", "no", false));
        resultEmail.add(new Email("persona27@hotmail.com", "hotmail", "si", false));
        resultEmail.add(new Email("persona26@outlook.com", "outlook", "no", false));
        resultEmail.add(new Email("persona28@sofka.com", "sofka", "si", false));
        resultEmail.add(new Email("persona26@sofka.com", "sofka","si", true));
        resultEmail.add(new Email("persona25@outlook.com", "outlook","no", false));
        resultEmail.add(new Email("persona24@sofka.com", "sofka","si", false));
        resultEmail.add(new Email("persona23@hotmail.com", "hotmail","no", false));
        resultEmail.add(new Email("persona22@gmail.com", "gmail","si", false));
        resultEmail.add(new Email("persona26.com", "com","si", false));
        resultEmail.add(new Email("persona@outlook.com", "outlook","si", false));
        resultEmail.add(new Email("persona30@gmail.com", "gmail","no", false));
        resultEmail.add(new Email("persona20@outlook.com", "outlook","si", false));
        resultEmail.add(new Email("juan@outlook.com", "outlook","no", false));
        resultEmail.add(new Email("juan@gmail.com", "gmail","si", false));
        resultEmail.add(new Email("persona3@hotmail.com", "hotmail","no", false));
        resultEmail.add(new Email("user4@gmaul.com", "gmaul","no", false));
        resultEmail.add(new Email("user2@sofka.com", "sofka","si", false));
        resultEmail.add(new Email("persona19@gmaul.com", "gmaul","si", false));
        resultEmail.add(new Email("persona17@gmaul.com","gmaul", "si", false));
        resultEmail.add(new Email("persona4@gmail.com", "gmail","no", false));
        resultEmail.add(new Email("persona7@hotmail.com", "hotmail","no", false));
        resultEmail.add(new Email("persona5@gmaul.com", "gmaul","si", false));
        resultEmail.add(new Email("persona4@gmail.com", "gmail","si", false));
        resultEmail.add(new Email("persona3@hotmail.com", "hotmail","no", false));
        resultEmail.add(new Email("persona1@hotmail.com", "hotmail","si", false));
        resultEmail.add(new Email("user2@sofka.com", "sofka","si", false));
        resultEmail.add(new Email("user1@sofka.com", "sofka","no", false));

        return resultEmail;
    }

}
