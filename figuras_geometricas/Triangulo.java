/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas;

/**
 *
 * @author jorge
 */
public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;
    
    public static final int EQUILATERO=1;
    public static final int ESCALENO=0;
    public static final int ISOSCELES=2;
            
    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(new Punto(x1,y1), new Punto(x2,y2), new Punto(x3,y3));
    }

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    public double getPerimetro(){
        double d1 = v1.distancia(v2);
        double d2 = v2.distancia(v3);
        double d3 = v3.distancia(v1);
                
        return d1+d2+d3;
    }
    
    public int getTipo(){
        double d1 = v1.distancia(v2);
        double d2 = v2.distancia(v3);
        double d3 = v3.distancia(v1);
        
        if (d1==d2 && d2==d3)
                return EQUILATERO;
        else if (d1==d2 || d1==d3 || d2==d3)
                return ISOSCELES;
        else
            return ESCALENO;   
    }

    @Override
    public String toString() {
        return "Triangulo{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }
    
}
