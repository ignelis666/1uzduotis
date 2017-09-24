import java.util.Random;

public class RandomKursas {

        private String[] items = new String[]{"Ismaniuju irenginiu technologijos","Programu sistemos","Elektronikos inzinerija","Informacijos sistemos"};

        private Random rand = new Random();

        public String getRandArrayElement(){

            return  items[(rand.nextInt(items.length))];
        }
    }

