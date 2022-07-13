package org.example.reto.util;

import org.example.reto.model.Email;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static List<Email> getEmailList(){
        List<Email> resultEmail = new ArrayList<>();
        resultEmail.add(new Email("persona30@gmail.com", "si", true));
        resultEmail.add(new Email("persona29@hotmail.com", "no", true));
        resultEmail.add(new Email("persona28@outlook.com", "no", false));
        resultEmail.add(new Email("persona27@gmail.com", "si", true));
        resultEmail.add(new Email("persona26@outlook.com", "no", false));
        resultEmail.add(new Email("persona28@outlook.com", "si", false));
        /*resultEmail.add(new Email("persona26@outlook.com", "si", true));
        resultEmail.add(new Email("persona25.com", "no", false));
        resultEmail.add(new Email("persona24@outlook.com", "si", false));
        resultEmail.add(new Email("persona23@hotmail.com", "no", false));
        resultEmail.add(new Email("persona22@gmaul.com", "si", true));
        resultEmail.add(new Email("persona26.com", "si", false));
        resultEmail.add(new Email("persona@gmaul.com", "si", true));
        resultEmail.add(new Email("persona30@gmail.com", "no", true));
        resultEmail.add(new Email("persona20@gmaul.com", "si", false));
        resultEmail.add(new Email("juan@outlook.com", "no", true));
        resultEmail.add(new Email("juan@gmaul.com", "si", false));
        resultEmail.add(new Email("persona3@hotmail.com", "no", true));
        resultEmail.add(new Email("user4@gmaul.com", "no", false));
        resultEmail.add(new Email("user2@sofka.com", "si", true));
        resultEmail.add(new Email("persona19@gmaul.com", "si", true));
        resultEmail.add(new Email("persona17@gmaul.com", "si", false));
        resultEmail.add(new Email("persona4@gmail.com", "no", true));
        resultEmail.add(new Email("persona7@hotmail.com", "no", true));
        resultEmail.add(new Email("persona5@gmaul.com", "si", false));
        resultEmail.add(new Email("persona4@gmail.com", "si", true));
        resultEmail.add(new Email("persona3@hotmail.com", "no", false));
        resultEmail.add(new Email("persona1@hotmail.com", "si", true));
        resultEmail.add(new Email("user2@sofka.com", "si", false));
        resultEmail.add(new Email("user1@sofka.com", "no", true));*/

        return resultEmail;
    }

}
