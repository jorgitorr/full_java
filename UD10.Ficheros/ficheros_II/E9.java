package ficheros_II;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {

        //corregir 5
        Scanner sc = new Scanner(System.in);
        String fichero;
        while(true){
            System.out.println("1. Consultar el tamaño de un fichero en bytes\n"+
            "2. Consultar el número de líneas de un fichero\n"+
            "3. Mostrar por pantalla el contenido de un fichero\n"+
            "4. Escribir en un fichero\n"+
            "5. Copiar un fichero\n"+
            "6. Salir");
            System.out.println("Introduce la opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Introduce fichero por teclado");
                    fichero = sc.nextLine();
                    System.out.println("El tamanio del fichero es: " + E8.tamanioFichero(fichero));
                    break;
                case 2:
                    System.out.println("Introduce fichero por teclado");
                    fichero = sc.nextLine();
                    System.out.println("El fichero tiene: " + E8.lineasFichero(fichero) + " lineas");
                    break;
                case 3:
                    System.out.println("Introduce fichero por teclado");
                    fichero = sc.nextLine();
                    System.out.println(E8.contenidoFichero(fichero));
                    break;
                case 4:
                    System.out.println("Introduce fichero por teclado");
                    fichero = sc.nextLine();
                    System.out.println("Introduce un texto: ");
                    String texto = sc.nextLine();
                    System.out.println("Introduce un modo(true/false)");
                    boolean modo = sc.nextBoolean();
                    E8.escribeFichero(fichero, texto, modo);
                    break;
                case 5:
                    System.out.println("Introduce el primer fichero: ");
                    String fichero1 = sc.nextLine();
                    System.out.println("Introduce el segundo fichero: ");
                    String fichero2 = sc.nextLine();
                    E8.copiaFichero(fichero1,fichero2);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
            } 

            if(opcion==6)
                break;
        }
    }
}
