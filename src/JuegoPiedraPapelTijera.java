/** @Author Andres Hernandez Mata

RANDOM NUMBER

Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su jugada y luego el ordenador genera
al azar una de las opciones. Si el usuario introduce una opcion incorrecta, el programa debera mostrar un mensaje
de error.

**/

import java.util.Scanner;

public class JuegoPiedraPapelTijera{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador (Introduza piedra, papel o tijera): ");
        String jugador = s.nextLine();

        int mano = (int)(Math.random() * 3);
        String ordenador = "";

        switch (mano){
            case 0:
                ordenador = "Piedra";
                break;
            case 1:
                ordenador = "Papel";
                break;
            case 2:
                ordenador = "Tijera";
                break;
            default:
        }

        System.out.println("Turno del ordenador: " + ordenador);

        if(jugador.equals(ordenador)){
            System.out.println("Empate");
        } else {
            int ganador = 2;
            switch (jugador){
                case "Piedra":
                    if(ordenador.equals("Tijera")){
                        ganador = 1;
                    }
                    break;
                case "Papel":
                    if(ordenador.equals("Piedra")){
                        ganador = 1;
                    }
                    break;
                case "Tijera":
                    if(ordenador.equals("Papel")){
                        ganador = 1;
                    }
                    break;
                default:
            }

            if(ganador == 1){
                System.out.println("Gana el jugador");
            } else {
                System.out.println("Gana el ordenador");
            }
        }
    }
}