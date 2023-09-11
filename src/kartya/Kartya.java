package kartya;

import java.util.Scanner;

public class Kartya {
    static String[] tomb=Kirak();
    public static void main(String[] args) {
        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }

    private static String[] Kirak() {
        String[] tomb = new String[21];
        int index = 0;

        String[] szin = {"P", "T", "Z", "M"};
        String[] ertek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < szin.length; i++) {
            if (i < 3) {

                for (String ertek1 : ertek) {
                    tomb[index] = szin[i] + "_" + ertek1;
                    index++;
                }
            } else {

                for (int j = 0; j < 3; j++) {
                    tomb[index] = szin[i] + "_" + ertek[j];
                    index++;
                }
            }
        }

        int i = 0;
        for (String tomb1 : tomb) {

            System.out.printf("%-7s", tomb1);

            i++;
            if (i == 3) {
                System.out.println("");
                i = 0;
            }

        }
        return tomb;
    }

    private static void Melyik() {
        Scanner beker = new Scanner(System.in);
        int szam;
        boolean helyes = false;
        while (helyes != true) {

            System.out.print("Melyik oszlop (1-3)?: ");
            szam = beker.nextInt();
            if (szam > 0 && szam < 4) {

                helyes = true;
            }
        }
        
        //teszt sor
    }

    private static void Kever() {
        
       String[] Atomb = new String[7];
       String[] Btomb = new String[7];
       String[] Ctomb = new String[7];
     
       
        for (int i = 0; i > 7; i++) {
            Atomb[i] =kapotttomb[i]
        }
        for (int i = 0; i > 7; i++) {
            Btomb[i] =kapotttomb[i]
        }
        for (int i = 0; i > 7; i++) {
            Ctomb[i] =kapotttomb[i]
        }
    }

    private static void EzVolt() {

    }

}
