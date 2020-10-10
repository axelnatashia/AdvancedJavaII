/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

/**
 *
 * @author axel
 */
public class Point {
    private double x;
    private double y;
    
    public Point(double initialX, double initialY)
    {
        x = initialX;
        y = initialY;
    }
    public Point()
    {
        x=0;
        y=0;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void setX(double initialX)
    {
        x=initialX;
    }
    public void setY(double initialY)
    {
        y=initialY;
    }
}
