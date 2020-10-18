/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto3;
import java.util.*;
/**
 *
 * @author axel
 */
public class Tuto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rNo;
        String own;
        int sCap;
        int sitCap;
        int stCap;
        
        Scanner key= new Scanner(System.in);
        
        System.out.println("please input reg no for car: ");
        rNo=key.next();
        System.out.println("please input your name: ");
        own=key.next();
        System.out.println("please input your seat capacity: ");
        sCap=key.nextInt();
        Car vCar = new Car(rNo, own, sCap);
        System.out.println(vCar.toString());
        
        System.out.println("please input reg no for bus: ");
        rNo=key.next();
        System.out.println("please input your name: ");
        own=key.next();
        System.out.println("please input your sitting capacity: ");
        sitCap=key.nextInt();
        System.out.println("please input your standing capacity: ");
        stCap=key.nextInt();
        Bus vBus= new Bus(rNo, own, sitCap, stCap);
        System.out.println(vBus.toString());
        
    }
}