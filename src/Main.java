//import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String[] pakli = new String[22];
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezVolt();
        //String[] kartya = kirak();
        //String valasztottKartya = melyik(kartya);
        //String tizenegyedikKartya = ezVolt();

    }
    public static void feltolt(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};

        int index = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                if (index < pakli.length) {
                    pakli[index] = szin + "_" + ertek;
                    index++;
                }
            }
        }
    }
    public static void kirak() {
        // String[] magyarKartya = {
                //"Makk 7", "Makk 8", "Makk 9", "Makk 10", "Makk Alsó", "Makk Felső", "Makk Király", "Makk Ász",
                //"Tök 7", "Tök 8", "Tök 9", "Tök 10", "Tök Alsó", "Tök Felső", "Tök Király", "Tök Ász",
               // "Káró 7", "Káró 8", "Káró 9", "Káró 10", "Káró Alsó", "Káró Felső", "Káró Király", "Káró Ász",
                //"Piros 7", "Piros 8", "Piros 9", "Piros 10", "Piros Alsó", "Piros Felső", "Piros Király", "Piros Ász"

        //return magyarKartya;

        //for (int i = 0; i < pakli.length; i++) {
           //pakli[i] = "Lap_" + i;
        //}

        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-" + 10 + "s", pakli[i]);
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }


    public static void melyik() {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("melyik oszlop (1-3): ");
        int oszlop = Integer.parseInt(sc.nextLine());
        if (oszlop < 1 || oszlop > 3) {
            System.out.println("Hibás választás. Kérlek válassz 1, 2 vagy 3 közül.");
        }

        //String valasztottKartya = scanner.nextLine();
        //if (Arrays.asList(kartya).contains(valasztottKartya)) {
            //System.out.println("A kártya érvényes választás.");
        //} else {
            //System.out.println("Hibás választás. Kérlek válassz a rendelkezésre álló kártyák közül.");
            //valasztottKartya = melyik(karyta); // Rekurzív hívás, amíg érvényes kártyát nem választ a felhasználó
        //}
        //scanner.close();

        //return valasztottKartya;
    }
    public static void kever() {

    }
    public static void ezVolt() {
        System.out.println("A gondolt lap: " + pakli[11]);
    }
}

