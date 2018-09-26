package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int numero1 = 0;
       int numero2 = 0;
       System.out.println("introdueix el primer nombre");
       numero1=in.nextInt();
       System.out.println("introdueix el segon nombre");
       numero2=in.nextInt();
       suma(numero1,numero2);
       resta(numero1,numero2);
       multiplicacio(numero1,numero2);
       divisio(numero1,numero2);
    }
    private static int suma(int x,int y)
    {
        System.out.println(x+"+"+y+"="+(x+y));
        return x+y;
    }
    private static int resta(int x,int y)
    {
        System.out.println(x+"-"+y+"="+(x-y));
        return x-y;
    }
     private static int multiplicacio(int x,int y)
    {
        System.out.println(x+"*"+y+"="+(x*y));
        return x*y;
    }
      private static int divisio(int x,int y)
    {
        System.out.println(x+"/"+y+"="+(x/y));
        return x/y;
    }
}
