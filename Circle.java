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
public class Circle {
    public Point center = new Point();
    public double radius;
    
    public Circle()
    {
        center.setX(0);
        center.setY(0);
        radius =0;
    }
    public Circle(double r, double x, double y)
    {
        radius =r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double setRadius(double r)
    {
        radius = r;
        return 0;
    }
}
