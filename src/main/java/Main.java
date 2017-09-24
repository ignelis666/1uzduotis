import com.google.gson.Gson;
import com.jaunt.*;
import com.jaunt.component.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.joda.time.Days;
import org.joda.time.LocalDate;


import java.io.FileWriter;
import java.io.IOException;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main
{
    static  skoluSkaiciuokle skaiciavimas = new skoluSkaiciuokle();
    static RandomKursas random = new RandomKursas();
    static LaikuiNustatyti laikas = new LaikuiNustatyti();
    static Reader reader = new Reader("http://bakalauras.lamabpo.lt/bendro-priemimo-rezultatai/2017-m/#1");
    static Location reader3 = new Location("https://www.gismeteo.lt/city/hourly/4230/");
    static Pavadinimas pav = new Pavadinimas();

    public static void main(String[] args) throws NotFound, com.jaunt.NotFound, ResponseException, IOException {

        System.out.println(skaiciavimas.Skolos());
        System.out.println(pav.Pav().toString());
        System.out.println("Studiju programa "+random.getRandArrayElement());
        System.out.println("Iki studiju pabaigimo liko : " + laikas.daysToNewYear().getDays()+ " dienos");
        System.out.println("Vietove: " + reader3.GetLokacija());
        System.out.println("Priimtu studentu skaicius 2017 metais: "+reader.GetPerziuros()+ "");
    }


}