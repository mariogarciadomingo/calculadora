package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int num1 = 0;
       int num2 = 0;
       int irrelevant1, irrelevant2;
       System.out.println("introdueix el primer nombre");
       num1=in.nextInt();
       System.out.println("introdueix el segon nombre");
       num2=in.nextInt();
       suma(num1,num2);
    }
    private static int suma(int x,int y)
    {
        System.out.println(x+"+"+y+"="+(x+y));
        return x+y;
    }
}
