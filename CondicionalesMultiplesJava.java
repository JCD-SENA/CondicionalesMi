package juanca.condicionalesmultiplesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 1
Un software que le pregunte al usuario por tres tamaños de vaso de papel y pregunta si quiere la bebida caliente o fria.
*/

public class CondicionalesMultiplesJava {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Que tipo de vaso desea? (S/M/L): ");
        String cupType = input.readLine().toLowerCase();
        if (cupType.equals("s") || cupType.equals("m") || cupType.equals("l")) {
            System.out.print("Bebida caliente o bebida fria (c/f): "); //Esto tenia más logica en mi mente
            String drinkHeat = input.readLine().toLowerCase();
            switch (cupType) {
                case "s":
                    System.out.print("Vaso pequeño ");
                    break;
                case "m":
                    System.out.print("Vaso medio ");
                    break;
                case "l":
                    System.out.print("Vaso grande ");
                    break;
            }
            switch (drinkHeat) {
                case "c":
                    System.out.println("caliente");
                    break;
                case "f":
                    System.out.println("frio");
                    break;
            }
        } else {
            System.out.println("Tipo no reconocido.");
        }
    }
}