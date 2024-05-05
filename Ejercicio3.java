package juanca.condicionalesmultiplesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 3
Un programa que de un mensaje si un número ingresado por le usuario es mayor que 0 o menor que 10 y otro si es mayor que 20 pero menor que 30
*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un numero 0-30: ");
        int n = Integer.parseInt(input.readLine());
        if (n <= 30 && n >= 0) {
            if (n >= 0 && n <= 10) {
                System.out.println("El numero está en el grupo 1");
            } else if (n > 10 && n <= 20) {
                System.out.println("El numero está en el grupo 2");
            } else if (n > 20 && n <= 30) {
                System.out.println("El numero está en el grupo 3");
            }
        } else {
            System.out.println("Numero por fuera del rango establecido.");
        }
    }
}
