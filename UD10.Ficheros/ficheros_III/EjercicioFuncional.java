package ficheros_III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioFuncional {

    private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    public static void leerCadena(){
        try {
            System.out.println("Introduce una cadena");
            String cadena = br.readLine();
            System.out.println(cadena);
        } catch (IOException e) {
            System.err.println("Error al leer cadena");
        }
    }

    public static void leerCaracter(){
        try {
            System.out.println("Introduce un caracter");
            char caracter = br.readLine().charAt(0);
            System.out.println(caracter);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public static void leerEntero(){
        try {
            System.out.println("Introduce un numero: ");
            String lectura = br.readLine();
            int entero = Integer.parseInt(lectura);
            System.out.println(entero);
        } catch (IOException e) {
            System.err.println("Error al leer archivo");
        }
    }

    public static void leerShort(){
        try {
            System.out.println("Introduce un numero: ");
            String lectura = br.readLine();
            short lecturaShort = Short.parseShort(lectura);
            System.out.println(lecturaShort);
        } catch (IOException e) {
            System.err.println("Error al leer archivo");
        }
    }

    public static void leerDouble(){
        try {
            System.out.println("Introduce un numero: ");
            String lectura = br.readLine();
            double lecturaShort = Double.parseDouble(lectura);
            System.out.println(lecturaShort);
        } catch (IOException e) {
            System.err.println("Error al leer archivo");
        }
    }

    public static void leerFloat(){
        try {
            System.out.println("Introduce un numero: ");
            String lectura = br.readLine();
            float lecturaShort = Float.parseFloat(lectura);
            System.out.println(lecturaShort);
        } catch (IOException e) {
            System.err.println("Error al leer archivo");
        }
    }

    public static void main(String[] args) {
        while(true){
            try {
                System.out.println("Menú\n\n"+
                "--------\n"+
                "1. Leer una cadena de texto.\n"+
                "2. Leer un caracter.\n"+
                "3. Leer un entero.\n"+
                "4. Leer un Short.\n"+
                "5. Leer un Double.\n"+
                "6. Leer un Float.\n"+
                "0. Salir.");
                String lectura = br.readLine();
                int opcion = Integer.parseInt(lectura);
                switch(opcion){
                        case 1:
                            EjercicioFuncional.leerCadena();
                            break;
                        case 2:
                            EjercicioFuncional.leerCaracter();
                            break;
                        case 3:
                            EjercicioFuncional.leerEntero();
                            break;
                        case 4:
                            EjercicioFuncional.leerShort();
                            break;
                        case 5:
                            EjercicioFuncional.leerDouble();
                            break;
                        case 6:
                            EjercicioFuncional.leerFloat();
                            break;
                        case 0:
                            System.out.println("Saliendo");
                            return;
                }
            
            }catch(IOException e){
                System.err.println("Error al leer dato");
            }
        }

    }
}


