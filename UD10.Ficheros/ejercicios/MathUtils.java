package ejercicios;

public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException{
        int fac = 1;
        for(int i=n;i>0; i--)
            fac *= i;

        return fac;
    }
}
