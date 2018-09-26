package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        boolean numero = true;
        do {
            System.out.println("Introdueix el primer nombre");
            try {
                numero1 = in.nextInt();
                numero = true;
            } catch (Exception e) {
                System.err.println("Això no es un numero!!");
                numero = false;
                in.next();
            }
        } while (!numero);
        do {
            System.out.println("Introdueix el segon nombre");
            try {
                numero2 = in.nextInt();
                numero = true;
            } catch (Exception e) {
                System.err.println("Això no es un numero!!");
                numero = false;
                in.next();     
            }
        } while (!numero);
        System.out.println(numero1 + "+" + numero2 + "=" + suma(numero1, numero2));
        System.out.println(numero1 + "-" + numero2 + "=" + resta(numero1, numero2));
        System.out.println(numero1 + "*" + numero2 + "=" + multiplicacio(numero1, numero2));
        System.out.println(numero1 + "/" + numero2 + "=" + divisio(numero1, numero2));
        
    }

    private static int suma(int x, int y) { 
        return x + y;
    }

    private static int resta(int x, int y) {
        return x - y;
    }

    private static int multiplicacio(int x, int y) {
        return x * y;
    }

    private static int divisio(int x, int y) {
        try{
        return x / y;
        }catch (Exception e) {
        System.err.println("Error Matemàtic");
        return 0;
        }
    }
}
