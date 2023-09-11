
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
            System.out.printf("%-7s",tomb1);
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
        System.out.println("irj egy lapot!: ");
        szam = beker.nextInt();
        //teszt sor
    }

    private static void Kever() {
    }

    private static void EzVolt() {
        
    }
    
}
