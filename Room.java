/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.pkg2;

/**
 *
 * @author axel
 */
public class Room 
{
    String name="";
    int noOfChair=0;
    boolean isBooked;
    Dimension inDimension;
    Window inWindow;
    
    public Room(String inName, int inNoOfChair, boolean inBooked, Dimension inDim, Window inWin)
    {
        this.name=inName;
        this.noOfChair=inNoOfChair;
        this.isBooked=inBooked;
        this.inDimension=inDim;
        this.inWindow=inWin;
    }
    
    public void setName(String inName)
    {
        this.name = inName;
    }
    
    public void setNoOfChair(int inNoOfChair)
    {
        this.noOfChair = inNoOfChair;
    }
    
    public void setInBooked(boolean inBooked)
    {
        this.isBooked = inBooked;
    }
    public String getName()
    {
        return this.name;
    }
    
    public int getNoOfChair()
    {
        return this.noOfChair;
    }
    
    public boolean getIsBooked()
    {
        return this.isBooked;
    }
    
    public String toString()
    {
       return "Room "+this.name+"\n With "+inDimension.toString()+"m, with "+inWindow.toString()+" \n and "+this.noOfChair+" chairs, and is already booked: "+this.isBooked;
    }
}
