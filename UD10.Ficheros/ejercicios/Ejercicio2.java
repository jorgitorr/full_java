package ejercicios;
public class Ejercicio2 {
    public static void main(String[] args) {
        String frase = "Ravenclaw";
        int i=0;
        try{
            while(true){
                System.out.println(frase.charAt(i));
                i++;
            }
        }catch(StringIndexOutOfBoundsException e){
            System.err.println("Sobrepasado el límite de la frase");
        }
        
    }
}
