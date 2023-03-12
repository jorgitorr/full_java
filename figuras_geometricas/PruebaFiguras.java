/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas;

/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class PruebaFiguras {
    
    public static String tipoToStr(int tipo){
        if (tipo==Triangulo.EQUILATERO)
            return "Equilátero";
        else if (tipo==Triangulo.ISOSCELES)
            return "Isósceles";
        else
            return "Escaleno";
    }
    
    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo(new Punto(-2,-3), new Punto(-4,-5), new Punto(-1,-6)); //isoseles
        Triangulo t2 = new Triangulo(new Punto(-2,1), new Punto(0,-1), new Punto(2,3)); //isosceles
        Triangulo t3 = new Triangulo(3,6,1,2,5,3); //escaleno
        
        Circulo c1 = new Circulo();
        Punto centro2 = new Punto(10,10);
        Circulo c2 = new Circulo(centro2,3);
        
        Scanner sc = new Scanner(System.in);
        int op=0;
        do  {
                    System.out.println("");
                    System.out.println("***************************************************************");
                    System.out.println("*                              MENU                           *");
                    System.out.println("***************************************************************");
                    System.out.println("*   1.Muestra vértices, perímetro y tipo triángulo 1          *");
                    System.out.println("*   2.Muestra vértices, perímetro y tipo triángulo 2          *");
                    System.out.println("*   3.Muestra centro, radio, circunsferencia y área círculo 1 *");
                    System.out.println("*   4.Muestra centro, radio, circunsferencia y área círculo 2 *");
                    System.out.println("*   5.Muestra distancia de círculo 1 a círculo 2              *");
                    System.out.println("*   6.Modifica radio y centro círculo 1                       *");        
                    System.out.println("*   7.Halla la circunsferencia de un círculo dado:            *");
                    System.out.println("*     el centro en (0,0) y el punto (3,4) en circunsferencia  *");    
                    System.out.println("*   8.Salir                                                   *");
                    System.out.println("***************************************************************");
                    System.out.println("*   Introduce tu opcion: ");
        
                    op = sc.nextInt();
                    switch (op) {
                            case 1: 
                                    System.out.println(t1);
                                    System.out.println(t1.getPerimetro());
                                    System.out.println(PruebaFiguras.tipoToStr(t1.getTipo()));
                                    break;
                            case 2: 
                                    System.out.println(t3);
                                    System.out.println(t3.getPerimetro());
                                    System.out.println(PruebaFiguras.tipoToStr(t3.getTipo()));
                                    break;
                            case 3:
                                    System.out.println(c1.getCircunsferencia());
                                    System.out.println(c1.getArea());
                                break;                   
                            case 4: 
                                    System.out.println(c2.getCircunsferencia());
                                    System.out.println(c2.getArea());
                                    break;
                            case 5: System.out.println(c1.distancia(c2));
                                    break;
                            case 6: System.out.println("Dime la coordenada x del centro del circulo");
                                    int x = sc.nextInt();
                                    System.out.println("Dime la coordenada y del centro del circulo");
                                    int y = sc.nextInt();
                                    double radio = 0.0;
                                    while(radio <= 0.0){
                                        System.out.println("Dime el radio del circulo");
                                        radio = sc.nextDouble();
                                    }
                                    Punto centro = new Punto(x,y);
                                    c1.setCentro(centro);
                                    c1.setRadio(radio);
                                    System.out.println(c1);
                                    break;
                            case 7: centro = new Punto();
                                    Punto p = new Punto(3,4);
                                    radio = centro.distancia(p);
                                    Circulo c = new Circulo(centro,radio);
                                    System.out.println(c);
                                    System.out.println(c.getCircunsferencia());
                                    break;
                            case 8: break;
                    }
        } while (op!=8);
    }
}
