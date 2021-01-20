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
    Scanner input = new Scanner(System.in);
    double discount, pay, cashback;
    int answer, choose, total, price;
    
    void showMenu() {
        executeTotal x = new executeTotal(); 
        printNota z = new printNota(); 
        executeCashback c = new executeCashback();
        
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
                System.out.print("Qty : ");
                answer = input.nextInt();
            }else{
                //memasukkan else tanpa printah yang dijalankan 
                //agar program tidak mengeksekusi apapun jika tak terpenuhi
            }
            x.executeTotal(choose, answer);
        } while(choose != 5); //Looping akan terjadi jika yang dipilih tidak sama dengan 5
        x.viewTotal();
        System.out.print("Pay : ");
        pay = input.nextDouble();
        c.executeCashback(pay);
        c.viewCashback();
        z.printNota();
    }    
}
