/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_3;

/**
 *
 * @author jorgearru
 */
public class Point3D extends Point2D{
    private int z;

    public Point3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }
    
    public Point3D() {
        super();
        this.z = 1;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + "z=" + z + '}';
    }
    
}
