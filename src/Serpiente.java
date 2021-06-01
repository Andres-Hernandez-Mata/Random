/** @Author Andres Hernandez Mata

RANDOM NUMBER

Realiza un programa que pinte por pantalla una serpiente con un "serpenteo" aleatorio. La cabeza
se representara con el caracter @ y se debe colocar exactamente en la posicion 13 (con 12 espacios
delante). A partir de ahi, el cuerpo ira serpentando de la siguiente manera: se genera de forma
aleatoria un valor entre tres posibles que hara que el siguiente caracter se coloque una posicion
a la izquierda del anterior, alineado con el anterior o una posicion a la derecha del anterior. La
longitud de la serpiente se pedira por teclado y se supone que el usuario introducira un dato
correcto.

**/

public class Serpiente{
    public static void main(String[] args){

        System.out.print("Por favor, introduzca la longitud de la serpiente en ");
        System.out.print(" caracteres contando la cabeza: ");
        int longitud = Integer.parseInt(System.console().readLine());

        System.out.println("            @");

        int i;
        int x = 13;

        while(longitud > 1){
            x += (int)(Math.random() * 3) - 1;

            for(i = 1; i < x; i++){
                System.out.print(" ");
            } 

            System.out.println("#");

            longitud--;
        }
    }
}