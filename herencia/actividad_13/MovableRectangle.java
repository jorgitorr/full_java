/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_13;

/**
 *
 * @author jorgearru
 */
public class MovableRectangle implements Movable{
    private MovablePoint esqSupIzq;
    private MovablePoint esqInfDer;

    public MovableRectangle(int mp1X, int mp1Y, int mp2X, int mp2Y, int speedX, int speedY) {
        this.esqSupIzq = new MovablePoint(mp1X, mp1Y, speedX,speedY);
        this.esqInfDer = new MovablePoint(mp2X, mp2Y, speedX, speedY);
    }

    /*No estamos en condiciones de hacer esto
    public MovableRectangle(MovablePoint mp1, MovablePoint mp2) {
        if(mp1.xSpeed!=mp2.xSpeed || mp1.ySpeed!=mp2.ySpeed)
            tiroExcepcion
        else
            puedo crear el objeto
    }*/
    
    

    
    @Override
    public void moveUp() {
        esqSupIzq.moveUp();
        esqInfDer.moveUp();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveDown() {
        esqSupIzq.moveDown();
        esqInfDer.moveDown();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveLeft() {
        esqSupIzq.moveLeft();
        esqInfDer.moveLeft();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveRight() {
        esqSupIzq.moveRight();
        esqInfDer.moveRight();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
