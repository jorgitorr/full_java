/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosEjercicio_I;

/**
 *
 * @author jorge
 */
public class Motocicleta {

    private int cv;
    private int velocidadMaxima;
    private String letrasMatricula;
    private int numMatriculas;

    public Motocicleta(int cv, int velocidadMaxima, String letrasMatricula, int numMatriculas) {
        this.cv = cv;
        this.velocidadMaxima = velocidadMaxima;
        this.letrasMatricula = letrasMatricula;
        this.numMatriculas = numMatriculas;
    }

    public Motocicleta() {
        this(0,0,"",3454634);
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

    public String getLetrasMatricula() {
        return letrasMatricula;
    }

    public void setLetrasMatricula(String letrasMatricula) {
        this.letrasMatricula = letrasMatricula;
    }

    public int getNumMatriculas() {
        return numMatriculas;
    }

    public void setNumMatriculas(int numMatriculas) {
        this.numMatriculas = numMatriculas;
    }

    //este método debería ser privado
    private String matricula(){
        return numMatriculas+letrasMatricula;
    }
    
    public void mostrarMatricula(){
        System.out.println(matricula());
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "cv=" + cv + ", velocidadMaxima=" + velocidadMaxima + ", letrasMatricula=" + letrasMatricula + ", numMatriculas=" + numMatriculas + '}';
    }
    
    public static void main(String[] args) {
        Motocicleta motocicleta1 = new Motocicleta();
        motocicleta1.setCv(100);
        motocicleta1.setNumMatriculas(456567);
        motocicleta1.setLetrasMatricula("ETS");
        motocicleta1.setVelocidadMaxima(230);
        
        Motocicleta motocicleta2 = new Motocicleta(120, 200, "ERT", 123456);
        
        System.out.println("Moto 1: " + motocicleta1);
        System.out.println("Moto 2: " + motocicleta2);
        
        motocicleta1.mostrarMatricula();
        motocicleta2.mostrarMatricula();
    }
    
}
