import com.jaunt.Element;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

public class Reader
{
    private String linkas;
    private Element views ;
    private UserAgent agent = new UserAgent();
    public Reader(String linkas) {
        this.linkas = linkas;
    }

    public String GetPerziuros() throws ResponseException, NotFound {
        agent.visit(linkas);
        views = agent.doc.findFirst("<td style=\"text-align: center;\" width=\"83\">1 855</td>");
        return views.innerHTML();
    }


}