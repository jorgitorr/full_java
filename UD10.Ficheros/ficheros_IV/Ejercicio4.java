package ficheros_IV;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 4. Crea una aplicación que almacene los datos básicos de un vehículo como la
matricula(String), marca (String), tamaño de deposito (double) y modelo (String)
en ese orden y de uno en uno usando la clase DataInputStream.
Los datos anteriores datos se pedirán por teclado y se irán añadiendo al fichero
(no se sobrescriben los datos) cada vez que ejecutemos la aplicación.
El fichero siempre será el mismo, en todos los casos.
Muestra todos los datos de cada coche en un cuadro de dialogo, es decir, si
tenemos 3 vehículos mostrara 3 cuadros de dialogo con sus respectivos datos.
Un ejemplo de salida de información puede ser este:
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la matricula");
        String matricula = sc.nextLine();
        System.out.println("Introduce la marca");
        String marca = sc.nextLine();
        System.out.println("Introduce el tamanio del deposito");
        double tamanioDeposito = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce el modelo");
        String modelo = sc.nextLine();

        String fichero = "coches.dat";

        try(DataOutputStream de = new DataOutputStream(new FileOutputStream("UD10.Ficheros/"+fichero,true));){
            de.writeUTF(matricula);
            de.writeUTF(marca);
            de.writeDouble(tamanioDeposito);
            de.writeUTF(modelo);
            
        }catch(IOException e){
            System.err.println("Error al introducir datos");
        }

        try(DataInputStream di = new DataInputStream(new FileInputStream("UD10.Ficheros/"+fichero));){
            
            while(di.available()>0){
                matricula = di.readUTF();
                marca = di.readUTF();
                tamanioDeposito = di.readDouble();
                modelo = di.readUTF();
                System.out.println("El vehículo con matricula " + matricula + ", marca " + marca 
                + " y modelo " + modelo + " tiene un deposito de " + tamanioDeposito);
            }
        } catch (IOException e) {
            System.err.println("Error al leer");
        }

    }
}
