package juanca.condicionalesmultiplesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 1
Un programa que solicite una contraseña, de ser valida entonces se le da acceso a un menú de 3 opciones.
*/

public class Ejercicio2 {
    static int userCount = 29;
    public static void main(String[] args) throws IOException {
        String truePass = "sgibvh";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la contraseña: ");
        String pass = input.readLine();
        if (pass.equals(truePass)) {
            System.out.print("1. Cantidad de usuarios\n2. Cambiar contraseña\n3. Salir\n?: ");
            int option = Integer.parseInt(input.readLine());
            switch (option) {
                case 1:
                    System.out.println("Hay "+userCount+" usuarios");
                    break;
                case 2:
                    System.out.print("Ingrese la nueva contraseña: ");
                    truePass = input.readLine();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Comando inexistente");
            }
            System.out.println("Cerrando...");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
