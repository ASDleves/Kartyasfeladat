
package kartya;

import java.util.Scanner;

public class Kartya {

    public static void main(String[] args) {
        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }
 private static void Kirak() {
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
            System.out.print(tomb1+"    ");
            i++;
            if (i == 3) {
                System.out.println("");
                i = 0;
            }
    
            
        }
}


    private static void Melyik() {
        Scanner beker = new Scanner(System.in);
        int szam;
        boolean helyes=false;
        while (helyes!=true) {            
            
        
        System.out.println("Melyik oszlop (1-3)?");
        szam = beker.nextInt();
        if (szam<0 || szam>4) {
            System.out.println("Hibás számot adtál meg");
            helyes=true;
        }
        }
        //teszt sor
    }

    private static void Kever() {
    }

    private static void EzVolt() {
        
    }
    
}
