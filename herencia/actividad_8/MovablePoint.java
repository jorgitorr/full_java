/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_8;

/**
 *
 * @author jorgearru
 */
public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        this(0,0,0,0);
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    public void setSpeed(float xSpeed, float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    
    public float[] getSpeed(){
        float[]speed = new float[2];
        speed[0] = getxSpeed();
        speed[1] = getySpeed();
        
        return speed;
    }
    
    public MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ",speed=(" + getSpeed()[0] + "," 
                + getSpeed()[1] + ")";
    }
    
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(4, 3, 6, 8);
        p.setSpeed(34, 45);
        System.out.println(p);
        p.move();
        System.out.println(p);
    }
    
    
    
}
