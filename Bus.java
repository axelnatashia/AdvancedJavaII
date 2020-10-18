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
public class Bus extends Vehicle
{
    int sittingCapacity;
    int standingCapacity;
    
    public Bus(String rNo, String own,int sitCap, int stCap)
    {
        super(rNo, own);
        this.sittingCapacity=sitCap;
        this.standingCapacity=stCap;
    }
    
    public void setSittingCapacity(int sitCap)
    {
        this.sittingCapacity=sitCap;
    }
    
    public void setStandingCapacity(int stCap)
    {
        this.standingCapacity=stCap;
    }
    
    public int getSittingCapacity()
    {
        return this.sittingCapacity;
    }
    
    public int getStandingCapacity()
    {
        return this.standingCapacity;
    }
    
    public String toString()
    {
        return "Bus "+this.regNo+" owned by "+this.owner+" with sitting capacity: "+this.sittingCapacity+" and standing capacity: "+this.standingCapacity;
    }
}
