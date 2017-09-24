import com.jaunt.*;
import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;
import sun.management.Agent;

public class Location {

    private String linkas;
    private Element lokacija;
    private UserAgent agent = new UserAgent();

    public Location(String linkas) {

        this.linkas = linkas;
    }

    public String GetLokacija() throws NotFound, ResponseException {
        agent.visit(linkas);
        lokacija = agent.doc.findFirst("<h2 class=typeC>");
        return lokacija.innerHTML();
    }


}