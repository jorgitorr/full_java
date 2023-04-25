package ficheros_III;

import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Menú\n\n"+
                "--------\n"+
                "1. Leer una cadena de texto.\n"+
                "2. Leer un caracter.\n"+
                "3. Leer un entero.\n"+
                "4. Leer un Short.\n"+
                "5. Leer un Double.\n"+
                "6. Leer un Float.\n"+
                "0. Salir.");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                        case 1:
                            Ejercicio.leerCadena();
                            break;
                        case 2:
                            Ejercicio.leerCaracter();
                            break;
                        case 3:
                            Ejercicio.leerEntero();
                            break;
                        case 4:
                            Ejercicio.leerShort();
                            break;
                        case 5:
                            Ejercicio.leerDouble();
                            break;
                        case 6:
                            Ejercicio.leerFloat();
                            break;
                        case 0:
                            System.out.println("Saliendo");
            }
                
        } 
        
    }
}
