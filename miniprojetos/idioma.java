package miniprojetos;

import java.util.Date;
import java.util.Locale;

public class idioma {
    public static void main(String[] args) {
       
        Date timer = new Date();

        Locale locale = Locale.getDefault();

     
        System.out.println("A hora do sistema é:");
        System.out.println(timer.toString());
        System.out.println("O idioma do sistema é:");
        System.out.println(locale.getDisplayLanguage() + " (" + locale.getLanguage() + ")");
    }
}

