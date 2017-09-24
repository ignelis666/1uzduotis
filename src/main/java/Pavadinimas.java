import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Pavadinimas {

    private Element Webas;

    public static String Pav() throws IOException {


        Document doc = Jsoup.connect("https://www.viko.lt/").get();
        String TinklalapioPavadinimas = doc.title();

        return "Tinklalapio pavadinimas: " + TinklalapioPavadinimas;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Pav());
    }



}
