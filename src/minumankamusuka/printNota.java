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
public class printNota {
    void printNota(menu m){
        System.out.println("========= Nota ========");
        System.out.println("Drink : ");
        for (modelDrink menu: m.getMenu()) {
            System.out.println("- " + menu.getName() + "  " + menu.getPrice());
        }        
        System.out.println("Total Discount : ");
        System.out.println("Price Per-drink : ");        
        System.out.println("Total Pay");
    }     
}
