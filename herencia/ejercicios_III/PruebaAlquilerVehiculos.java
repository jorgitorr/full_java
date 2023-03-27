package herencia.ejercicios_III;

import java.util.Scanner;

public class PruebaAlquilerVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos vehiculos quieres alquilar?");
        int cantidadCoches = sc.nextInt();
        Alquiler alquiler = new Alquiler("alquilar", cantidadCoches);
        alquiler.mostrar();
    }
}
