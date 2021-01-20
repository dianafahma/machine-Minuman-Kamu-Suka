/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minumankamusuka;

/**
 *
 * @author Asus
 */
public class modelDrink {
    private double price;
    private double totalPrice = 0;
    private String name;
    private int qty = 0;
    
    modelDrink(String name, double price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    
    public void setPrice(int price){
        this.price += price;
    }
    
    public void setQty(int qty){
        this.qty += qty;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQty() {
        return qty;
    }
}
