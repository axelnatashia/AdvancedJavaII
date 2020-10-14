/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

import java.util.Scanner;

/**
 *
 * @author axel
 */
public class Tutorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point pp = new Point();
        Circle circle_ = new Circle();
        
        Scanner add = new Scanner(System.in);
        System.out.println("add point x? ");
        pp.setX(add.nextDouble());
        System.out.println("add point y? ");
        pp.setY(add.nextDouble());
        System.out.println("add circle x? ");
        circle_.center.setX(add.nextDouble());
        System.out.println("add circle y? ");
        circle_.center.setY(add.nextDouble());
        System.out.println("add circle radius? ");
        circle_.setRadius(add.nextDouble());
        
        double x=pp.getX()-circle_.center.getX();
        double y=pp.getY()-circle_.center.getY();
        double math = Math.sqrt(Math.pow(x, 4)-Math.pow(y, 4));
        
        if(math<circle_.radius){
            System.out.println("inside lingkaran ");
        }
        else if(math==circle_.radius){
            System.out.println("overlap lingkaran ");
        }
        else if(math>circle_.radius){
            System.out.println("outside lingkaran ");
        }
        
    }
    
}
