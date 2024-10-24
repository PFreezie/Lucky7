import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int raha = 5;
        String jatkaa = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Lisää rahat peliin. Omistat "+raha+"€ yhteensä rahaa!");

        do {


            System.out.println("Haluatko jatkaa? Paina Enter jatkaaksesi! Poistu pelistä painamalla e ja Enter.");
            jatkaa = in.nextLine();
        } while ( jatkaa.equals("") && !jatkaa.equals("e"));
    }
}
