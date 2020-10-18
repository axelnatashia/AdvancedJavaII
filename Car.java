/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto3;

/**
 *
 * @author axel
 */
public class Car extends Vehicle
{
    int seatCapacity;
    
    public Car(String rNo, String own, int Scap)
    {
        super (rNo, own);
        this.seatCapacity=Scap;
    }
    
    public void setSeatCapacity(int Scap)
    {
        this.seatCapacity=Scap;
    }
    
    public int getSeatCapacity()
    {
        return this.seatCapacity;
    }
    
    public String toString()
    {
        return "Car "+this.regNo+" owned by "+this.owner+" with seat capacity "+this.seatCapacity;
    }
}