package ficheros_III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio {

    public static void leerCadena(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Introduce una cadena");
            String cadena = br.readLine();
            System.out.println(cadena);
        } catch (IOException e) {
            System.err.println("Error al leer cadena");
        }
    }

    public static void leerCaracter(){
        try (BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Introduce un caracter");
            char caracter = lectura.readLine().charAt(0);
            System.out.println(caracter);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public static void leerEntero(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Introduce un numero: ");
            String lectura = br.readLine();
            int entero = Integer.parseInt(lectura);
            System.out.println(entero);
        } catch (IOException e) {
            System.err.println("Error al leer archivo");
        }
    }

    public static void leerShort(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Introduce un numero: ");
            String lectura = br.readLine();
            short lecturaShort = Short.parseShort(lectura);
            System.out.println(lecturaShort);
        } catch (IOException e) {
            System.err.println("Error al leer archivo");
        }
    }

    public static void leerDouble(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Introduce un numero: ");
            String lectura = br.readLine();
            double lecturaShort = Double.parseDouble(lectura);
            System.out.println(lecturaShort);
        } catch (IOException e) {
            System.err.println("Error al leer archivo");
        }
    }

    public static void leerFloat(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
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
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
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
                switch(lectura){
                        case "1":
                            Ejercicio.leerCadena();
                            break;
                        case "2":
                            Ejercicio.leerCaracter();
                            break;
                        case "3":
                            Ejercicio.leerEntero();
                            break;
                        case "4":
                            Ejercicio.leerShort();
                            break;
                        case "5":
                            Ejercicio.leerDouble();
                            break;
                        case "6":
                            Ejercicio.leerFloat();
                            break;
                        case "0":
                            System.out.println("Saliendo");
                            break;
                }

                if(lectura=="0")
                    break;
                
            } catch (IOException e) {
                System.err.println("Error al leer");
                break;
            }

        
        }
    }
}
