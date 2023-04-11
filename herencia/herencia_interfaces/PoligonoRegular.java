/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_interfaces;

/**
 *
 * @author jorgearru
 */
public abstract class PoligonoRegular extends Polygon{
    private double apotema;
    private double lenLado;

    
    public PoligonoRegular(int nLados, double apotema) {
        super(nLados);
        this.apotema = apotema;
        this.lenLado = lenLado();
    }


    private double lenLado(){
        return getPerimeter()/nLados;
    }

    @Override
    public double getArea() {
        return (getPerimeter()*apotema)/2;
    }

    @Override
    public double getPerimeter() {
        return lenLado*nLados;
    }

    
    
}
