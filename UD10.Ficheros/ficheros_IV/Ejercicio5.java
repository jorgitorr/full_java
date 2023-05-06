package ficheros_IV;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String fichero = "coches.dat";
        String matricula, marca, modelo;
        int tamanioDeposito;
        Set<Vehiculo>vehiculos = new HashSet<>(); 

        try (ObjectOutputStream ou = new ObjectOutputStream(new FileOutputStream("UD10.Ficheros/"+fichero));) {
            while(true){
                System.out.println("Introduce matricula:");
                matricula = sc.nextLine();
                System.out.println("Introduce la marca: ");
                marca = sc.nextLine();
                System.out.println("Introduce tamanio deposito: ");
                tamanioDeposito = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduce el modelo");
                modelo = sc.nextLine();
                System.out.println("¿Quieres introducir otro vehiculo?");
                String quiero = sc.nextLine();
                
                Vehiculo vehiculo = new Vehiculo(matricula, marca, tamanioDeposito, modelo);
                vehiculos.add(vehiculo);

                if(quiero.equalsIgnoreCase("NO"))
                    break;
            }
            
            for(Vehiculo vehiculo: vehiculos)
                ou.writeObject(vehiculo);

        } catch (IOException e) {
            System.err.println("Error al leer fichero");
        } 

        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("UD10.Ficheros/"+fichero))) {
            while(true){
                System.out.println((Vehiculo)oi.readObject());
            }
        }catch (EOFException e) {
            // Se ha llegado al final del archivo, no hay más objetos por leer
        } catch (ClassNotFoundException e) {
            System.err.println("Clase no encontrada");
        } catch (IOException e) {
            System.err.println("Error al leer fichero");
        }
    }
    

}
