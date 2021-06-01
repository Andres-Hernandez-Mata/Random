/** @Author Andres Hernandez Mata

RANDOM NUMBER

Realiza un programa que pinte un pecera con un pececito dentro. Se debe pedir al usuario el ancho y el alto
de la pecera, que como minimo seran de 4 unidades. No hay que comprobar que los datos se introducen 
correctamente; podemos suponer que el usuario los introduce bien. Dentro de la pecera hay que colocar de
forma aleatoria, que puede estar situado en cualquier de las posiciones que quedan en el hueco que
forma del rectangulo.

**/

public class Pecera{
    public static void main(String[] args){
        System.out.print("Por favor, introduzca la altura de la pecera (como minimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());

        System.out.print("Ahora introduzca la anchura (como minimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());

        int posicion = 0;

        int pez = (int)(Math.random()*(altura - 2)*(anchura - 2));

        for(int i = 0; i < anchura; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 2; i < altura; i++){
            System.out.print("*");
            for(int j = 2; j < anchura; j++){
                if(posicion == pez){
                    System.out.print("&");
                } else {
                    System.out.print(" ");
                }
                posicion++;
            }
            System.out.println("*");
        }
        for(int i = 0; i < anchura; i++){
            System.out.print("*");
        }
    }
}