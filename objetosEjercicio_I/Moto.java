/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosEjercicio_I;

/**
 *
 * @author jorge
 */
public class Moto {

    private int cv;
    private int velocidadMaxima;
    private String matricula;

    public Moto(int cv, int velocidadMaxima, String matricula) {
        this.cv = cv;
        this.velocidadMaxima = velocidadMaxima;
        this.matricula = matricula;
    }

    public Moto() {
        this(0,0,"");
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Moto{" + "cv=" + cv + ", velocidadMaxima=" + velocidadMaxima + ", matricula=" + matricula + '}';
    }
    
    
    
    public static void main(String[] args) {
        Moto motocicleta1 = new Moto();
        motocicleta1.setCv(100);

        motocicleta1.setVelocidadMaxima(230);
        motocicleta1.setMatricula("4564565ERT");
        motocicleta1.setCv(200);
        
        Moto motocicleta2 = new Moto(120, 200, "123456ERT");
        
        System.out.println("Moto 1: " + motocicleta1);
        System.out.println("Moto 2: " + motocicleta2);

    }
    
}
