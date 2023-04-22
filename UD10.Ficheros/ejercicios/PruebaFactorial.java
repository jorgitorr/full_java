package ejercicios;

import java.util.Scanner;

public class PruebaFactorial {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while(keepGoing.equals("y") || keepGoing.equals("Y")){
            
            System.out.println("Enter an integer: ");
            int val = scan.nextInt();
            if(val<0 || val<Math.pow(2, 10))
                throw new IllegalArgumentException("el numero es menor que cero");
            else{
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
                System.out.println("Another factorial(y/n): ");
                keepGoing = scan.next();
            }

        }   
    }
}
