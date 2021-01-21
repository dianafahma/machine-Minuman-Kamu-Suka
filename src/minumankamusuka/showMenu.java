/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minumankamusuka;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class showMenu {
    private Scanner input = new Scanner(System.in);
    private double discount, pay;
    private int answer, choose, total;
 
    modelDrink[] menuDrinks = new modelDrink[] { new modelDrink("Juice", 10000, 0), new modelDrink("Coffee", 7000, 0),
            new modelDrink("Water", 5000, 0), new modelDrink("Soda", 13000, 0), };
     
    public void showMenu() {
        printNota z = new printNota(); 
        menu m = new menu(menuDrinks);
        
        System.out.println("=======================");
        System.out.println("Mesin Minuman Kamu Suka");
        System.out.println("=======================");
        
        //agar program dapat memunculkan menu lagi setelah memelih minuman dan qty nya
        //maka menggunakan do while
        do {
        System.out.println("========= MENU ========");
        System.out.println("[1] Juice = 10000");
        System.out.println("[2] Coffe = 7000");
        System.out.println("[3] Water = 5000");        
        System.out.println("[4] Soda  = 13000");
        System.out.println("\n[5] Insert Discount");
        System.out.println("[6] Print Nota");               
        System.out.println("[7] exit");        
        System.out.println("=======================");
        System.out.print("choose the menu :");
	choose = input.nextInt();
            if (choose >= 1 && choose <= 4) {
                //jika yang dipilih menu 1-4 maka perintahnya akan dieksekusi
                modelDrink selectedMenu = menuDrinks[choose - 1];    
                //mengambil nilai array
                System.out.print("Qty : ");
                answer = input.nextInt();
                selectedMenu.setQty(answer);                
            }else{
                //memasukkan else tanpa printah yang dijalankan 
                //agar program tidak mengeksekusi apapun jika tak terpenuhi
                break;
            }
        } while(choose != 5); //Looping akan terjadi jika yang dipilih tidak sama dengan 5
        z.printNota(m);
    }    
}