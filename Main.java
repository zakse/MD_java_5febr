import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. uzdevums

        String name = "Arta";
        System.out.println(name);

        int vecums = 40;
        System.out.println(vecums);

        double augums_m = 1.94;
        System.out.println(augums_m);

        System.out.println("Vai man patīk programēšana");
        boolean jaa = true;
        boolean nee = false;

        System.out.println(jaa);
        System.out.println(nee);
        //par šo neesmu pārliecināta, jo gribēju, lai konsolē izvadās "jā" nevis "true"

        // 2. un 3. uzdevums

        Scanner scan = new Scanner(System. in);

        System.out.println("Ievadi savu vārdu: ");
        String vards = scan.nextLine();

        System.out.println("Ievadi savu vecumu: ");
        long gadi = scan.nextLong();

        System.out.println("Ievadi savu garumu: ");
        long garums = scan.nextLong();

        System.out.println("Vai Tev patīk programmēt? Atbildi ar jā vai nē: ");
        String atbilde = scan.nextLine();

        System.out.println(vards);
        System.out.println(gadi);
        System.out.println(garums);
        System.out.println(atbilde);

    }
}