import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int raha = 5;
        String pelata = "temporary";
        String jatkaa = "";

        Scanner in = new Scanner(System.in);
        Random Random = new Random();


        do {
            int voitto = 0;
            System.out.println("Lisää rahat peliin. Omistat "+raha+" euroa yhteensä rahaa!");
            int rahaMaara = Integer.parseInt(in.nextLine());

            do {
                if ( rahaMaara > raha){
                    System.out.println("Sinä et voi laittaa tuon verran rahaa");
                    System.out.println("Lisää rahat peliin. Omistat "+raha+" euroa yhteensä rahaa!");
                    rahaMaara = Integer.parseInt(in.nextLine());
                }
                else if (rahaMaara <= 0) {
                    System.out.println("Sinä et voi laittaa tuon verran rahaa");
                    System.out.println("Lisää rahat peliin. Omistat "+raha+" euroa yhteensä rahaa!");
                    rahaMaara = Integer.parseInt(in.nextLine());
                }
                else {
                    System.out.println("Paina enter pelataksesi peliä. Jos et halua pelata, paina e ja Enter!");
                    pelata = in.nextLine();
                }
                
            } while (!pelata.equals("") && !pelata.equals("e"));

            if (pelata.equals("e")) {
                break;
            }
            else {
                raha -= rahaMaara;
            }
            
            
            int randomNumber1 = Random.nextInt(7)+1;
            int randomNumber2 = Random.nextInt(7)+1;
            int randomNumber3 = Random.nextInt(7)+1;

            if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7) {
                voitto +=3;
                System.out.println("Voitit 3 kertaa!");
                raha += (rahaMaara*7);
                System.out.println("Omistat "+raha+" euroa yhteensä rahaa!");
            }
            else if (randomNumber1 == 7 && randomNumber2 == 7 || randomNumber2 == 7 && randomNumber3 == 7 || randomNumber1 == 7 && randomNumber3 == 7){
                voitto +=2;
                System.out.println("Voitit 2 kertaa!");
                raha += (rahaMaara*voitto)
                System.out.println("Omistat "+raha+" euroa yhteensä rahaa!");
            }
            else if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7){
                voitto +=1;
                System.out.println("Voitit!");
                raha += (rahaMaara*voitto);
                System.out.println("Omistat "+raha+" euroa yhteensä rahaa!");
            }
            else {
                System.out.println("Hävisit!");
                System.out.println("Omistat "+raha+" euroa yhteensä rahaa!");

                if (raha <= 0){
                    System.out.println("Sinulla ei ole rahaa. Et voi enää pelata!");
                    break;
                }
            }

            System.out.println("Haluatko jatkaa? Paina Enter jatkaaksesi! Poistu pelistä painamalla e ja Enter.");
            jatkaa = in.nextLine();
        } while ( jatkaa.equals("") && !jatkaa.equals("e"));
    }
}
