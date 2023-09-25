package kartya;

import java.util.Scanner;

public class Kartya {

    static String[] tomb=Kirak();
    static int valasztas = Melyik();

    public static void main(String[] args) {
        jatek();
        EzVolt();
    }

    private static void jatek() {
        Kever();
    for (int i = 0; i < 3; i++) {
        valasztas = Melyik();
        Kever();
        
    }

        
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

    private static int Melyik() {
        System.out.println("");
        Scanner beker = new Scanner(System.in);
        boolean helyes = false;
        int szam = 0;
        while (helyes != true) {
            System.out.print("Melyik oszlop (1-3)?: ");
            szam = beker.nextInt();
            if (szam > 0 && szam < 4) {

                helyes = true;
            }
        }
        return szam;
        
        
    }

    private static void Kever() {
        System.out.println("");
        String[] Elso = new String[7];
        String[] Masodik = new String[7];
        String[] Harmadik = new String[7];
        for (int i = 0; i < 7; i++) {
            Elso[i] = tomb[18-i*3];
        }
        
        
        for (int i = 0; i < 7; i++) {
            Masodik[i] = tomb[19-i*3];
        }
        for (int i = 0; i < 7; i++) {
            Harmadik[i] = tomb[20-i*3];
        }

        int index;
        switch(valasztas){
            case 1:
            for(index = 0; index < 7; index++){
            tomb[index] = Masodik[index];
            }
            for(index = 0; index < 7; index++){
            tomb[index+7] = Elso[index];
            }
            
            for(index = 0; index < 7; index++){
            tomb[index+14] = Harmadik[index];
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
            break;
            case 2:
                for(index = 0; index < 7; index++){
            tomb[index] = Elso[index];
            }
            for(index = 0; index < 7; index++){
            tomb[index+7] = Masodik[index];
            }
            
            
            for(index = 0; index < 7; index++){
            tomb[index+14] = Harmadik[index];
            }
             i = 0;
        for (String tomb1 : tomb) {

            System.out.printf("%-7s", tomb1);

            i++;
            if (i == 3) {
                System.out.println("");
                i = 0;
            }
        }
            break;
            case 3:
            for(index = 0; index < 7; index++){
            tomb[index] = Elso[index];
            }
            for(index = 0; index < 7; index++){
            tomb[index+7] = Harmadik[index];
            }
            for(index = 0; index < 7; index++){
            tomb[index+14] = Masodik[index];
            }
             i = 0;
        for (String tomb1 : tomb) {

            System.out.printf("%-7s", tomb1);

            i++;
            if (i == 3) {
                System.out.println("");
                i = 0;
            }
        }
            break;
        }
        
    }
    
    private static void EzVolt() {
        System.out.println(tomb[10]);
    }


}
