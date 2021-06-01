/** @Author Andres Hernandez Mata

RANDOM NUMBER

Realiza un programa que pinte una tableta de turron con un bocado realizado de forma aleatoria. El
ancho y el alto de la tableta se pide por teclado. El bocado se da alrededor del turron, 
obviamente no se puede dar un bocado por en medio de la tableta.

**/

import java.util.Scanner;

public class TabletaTurronBocado{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = Integer.parseInt(s.nextLine());

        System.out.print("Introduzca la altura de la tableta: ");
        int altura = Integer.parseInt(s.nextLine());

        int mordisco = (int)(Math.random() * (anchura * 2 + (altura - 2) * 2));

        int posicion = 0;
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < anchura; j++){
                boolean borde = (i == 0) || (i == altura - 1) || (j == 0) || (j == anchura -1);
                if((posicion == mordisco) && borde){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                if(borde){
                    posicion++;
                }
            }
            System.out.println();
        }
    }
}