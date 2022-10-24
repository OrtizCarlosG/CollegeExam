/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeexam;

/**
 *
 * @author carlo
 */
public class Butaca {
    private String descriptor;
    private double price;
    private boolean state;
    
    public Butaca(String descriptor, double price){
        this.descriptor = descriptor;
        this.price = price;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    public void setState(boolean newState)
    {
        this.state = newState;
    }
    
    @Override
    public String toString()
    {
        return "Descriptor: " + this.descriptor +" Price: " + this.price +" State: " + this.state;
    }
}
