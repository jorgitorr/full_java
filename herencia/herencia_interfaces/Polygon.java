package herencia_interfaces;

public class Polygon extends Shape{
    protected int nLados;

    public Polygon(String color, boolean filled, int nLados) {
        super(color, filled);
        this.nLados = nLados;
    }

    public Polygon(int nLados) {
        super();
        this.nLados = nLados;
    }

    public Polygon() {
        this(1);
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
