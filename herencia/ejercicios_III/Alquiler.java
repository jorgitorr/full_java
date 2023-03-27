package herencia.ejercicios_III;

import java.util.Scanner;

public class Alquiler implements Exportable{
    private Vehiculo[]pedido;
    private String nombre;

    public Alquiler(int numVehiculos) {
        this(null,numVehiculos);
    }

    public Alquiler(String nombre, int numVehiculos) {
        this.nombre = nombre;
        pedido = new Vehiculo[numVehiculos];
        pedirVehiculo();
    }

    private void pedirVehiculo(){
        Scanner sc = new Scanner(System.in);
        String matricula;
        int duracion, plazas, tara;
        Vehiculo vehiculo;

        for(int i=0;i<pedido.length-1; i++){
            vehiculo = null;
            System.out.println("Nuevo vehiculo");
            System.out.println("Introduce matricula: ");
            matricula = sc.nextLine();
            System.out.println("Introduce duracion: ");
            duracion = sc.nextInt();
            System.out.println("Introduce plazas");
            plazas = sc.nextInt();
            System.out.println("Introduce tara: ");
            tara = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce el tipo de vehiculo(C/B/F/T): ");
            char tipo = sc.nextLine().charAt(0);

            switch(tipo){
                case 'C':
                    vehiculo = new Coche(matricula,duracion,plazas);
                    break;
                case 'B':
                    vehiculo = new Bus(matricula,duracion,plazas);
                    break;  
                case 'F':
                    vehiculo = new Furgoneta(matricula, duracion, tara);
                    break;
                case 'T':
                    vehiculo = new Camion(matricula, duracion, tara);
                    break;         
            }

            pedido[i] = vehiculo;
            System.out.println("vehiculo introducido...");
        }
        
    }

    public double importeTotal(){
        double total = 0;
        for(int i=0; i<pedido.length-1; i++)
            total += pedido[i].alquiler();

        return total;
    }

    public double importe(int pos){
        double importe = 0;
        importe = pedido[pos].alquiler();

        return importe;
    }

    @Override
    public void mostrar() {
        System.out.println("Total alquiler: " + importeTotal());
        System.out.println("--------------");
        System.out.println("DETALLE");
        System.out.println("--------------");
        for(int i= 0; i<pedido.length-1; i++){
            System.out.println(pedido[i]);
        }
    }

    @Override
    public void imprimir(String file) {
        
    }
    
}
