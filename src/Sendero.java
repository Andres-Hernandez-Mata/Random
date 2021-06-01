/** @Author Andres Hernandez Mata

RANDOM NUMBER

Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el caracter "|". La anchura del sendero
siempre es la misma, los caracteres del borde mas cuatro caracteres en medio, en total 6 caracteres (incluyendo espacios
). A cada metro, el sendero puede continuar recto, girar un caracter a la izquierda o girar un caracter a la 
derecha, por supuesto de forma aleatoria. Por cada metro de sendero - representado por una linea - puede que haya un 
obstaculo o puede que no, la probabilidad es del 50%. La posicion del obstaculo es aleatoria dentro de la linea.
En caso de existir un obstaculo en un metro de sendero (en una linea), puede ser una planta (caracter*) o una 
piedra (caracter O), la probabilidad de que salga uno u otro es la misma. Recueda que nunca habra mas de un 
obstaculo por metro de sendero, habra uno o ninguno.

**/

import java.util.Scanner;

public class Sendero{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la longitud del sendero o en metros: ");
        int longitudSendero = Integer.parseInt(s.nextLine());

        int espaciosAdelante = 6;

        for(int i = 0; i < longitudSendero; i++){
            for(int j = 0; j < espaciosAdelante; j++){
                System.out.print(' ');
            }
            System.out.print('|');

            int posicionObstaculo = -1;
            char obstaculo = '*';

            if((int)(Math.random() * 2) == 0){
                posicionObstaculo = (int)(Math.random() * 4);
                if((int)(Math.random() * 2) == 0){
                    obstaculo = 'O';
                }
            }

            for(int j = 0; j < 4; j++){
                System.out.print(j == posicionObstaculo ? obstaculo : ' ');
            }

            System.out.println('|');
            espaciosAdelante += (int)(Math.random() * 3) - 1; 
        }
    }
}