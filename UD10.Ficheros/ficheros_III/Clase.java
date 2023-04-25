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
                            EjercicioNoVa.leerCadena();
                            break;
                        case 2:
                            EjercicioNoVa.leerCaracter();
                            break;
                        case 3:
                            EjercicioNoVa.leerEntero();
                            break;
                        case 4:
                            EjercicioNoVa.leerShort();
                            break;
                        case 5:
                            EjercicioNoVa.leerDouble();
                            break;
                        case 6:
                            EjercicioNoVa.leerFloat();
                            break;
                        case 0:
                            System.out.println("Saliendo");
            }
                
        } 
        
    }
}
