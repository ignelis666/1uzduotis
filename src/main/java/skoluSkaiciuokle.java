import java.util.Scanner;

public class skoluSkaiciuokle {
    public static int Skolos()
    {
        double skolosKaina = 21.31;
        System.out.println("Iveskite turimu skolu skaiciu : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double rezultatas = i * skolosKaina;
        System.out.println("Jusus skolos suma eurais :" +rezultatas + "\u20ac");
        if (rezultatas > 50)
        {
            System.out.println("Pagalvok ar tikrai ten istojai");
        }
        return i;


    }

    public static void main(String[] args) {
        System.out.println("Sveiki" + Skolos());
    }
}
