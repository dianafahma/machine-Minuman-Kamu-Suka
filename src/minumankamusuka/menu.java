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
public class menu {
    private modelDrink juice, coffe, water, soda;
    private modelDrink[] menu = new modelDrink[4];
    //membuat deklarasi array
    
    private double originalCost = 0;
    private double finalCost = 0;
    
    menu(modelDrink[] menu)  {
        this.menu = menu;
        juice = menu[0];
        coffe = menu[1];
        water = menu[2];
        soda = menu[3];
    }
    
    public modelDrink[] getMenu(){
        //untuk mengambil nilai dari menu
        return menu;
    }
    
    public double getOriginalCost() {
        //untuk mengambil nilai dari original cost
        return originalCost;
    }    

    public double getFinalCost() {
        //untuk mengambil nilai dari final cost
        return finalCost;
    }

    public void discount1() {
        if (juice.getQty() == 3) {
            double newCoffeePrice = coffe.getPrice() - 0.03;
            coffe.setPrice(newCoffeePrice);
        }
    }
        
    public void discount2() {
        if (coffe.getQty() == 3 && soda.getQty() == 3) {
            double newWaterPrice = water.getPrice() - 0.09;
            water.setPrice(newWaterPrice);
        }
    }        
 
    public void discount3() {
        if (water.getQty() == 1) {
            double newJuicePrice = juice.getPrice() - 0.01;
            double newCoffeePrice = coffe.getPrice() - 0.03;
            double newSodaPrice = soda.getPrice() - 0.003;

            juice.setPrice(newJuicePrice);
            coffe.setPrice(newCoffeePrice);
            soda.setPrice(newSodaPrice);
        }
    }    
}
