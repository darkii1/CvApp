import cvClass.*;

import java.util.ArrayList;
import java.util.Date;

public class Person {
    public static void main(String[] args) {

        personalInfo qwertyP = new personalInfo("Petr", "abc", "alik", "ul pushkina", "888555", "@", "linlk");
        experience qwerty2 = new experience("Azbuka", "Tut","HolaHola", new Date(20-05-2015), new Date(), "Did some stafffff" );
        summary qwerty = new summary("qwe");
        ArrayList<experience> list = new ArrayList<experience>();
        list.add(qwerty2);
        cv A = new cv(qwertyP, list,qwerty);

    }
}
