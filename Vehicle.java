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
public class Vehicle
{
    String regNo;
    String owner;
    
    public Vehicle(String rNo, String own)
    {
        this.regNo=rNo;
        this.owner=own;
    }
    
    public void setOwner(String own)
    {
        this.owner=own;
    }
    
    public void setRegNo(String rNo)
    {
        this.regNo=rNo;
    }
    
    public String getOwner()
    {
        return this.owner;
    }
    
    public String getRegNo()
    {
        return this.regNo;
    }
    
    public String toString()
    {
        return this.regNo+" owned by "+this.owner;
    }
}
