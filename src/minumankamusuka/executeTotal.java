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
public class executeTotal {
    showMenu y = new showMenu();
    
    int executeTotal(int choose, int answer1) {
        y.answer = answer1;
        switch(choose) {
            case 0:
                System.exit(0);
                //untuk membuat program keluar setelah dijalankan
                break;
            case 1:
                y.price = 10000;
                y.total = y.total+(y.price*answer1);
                //untuk menghitung total harganya
                break;
            case 2:
                y.price = 7000;
                y.total = y.total+(y.price*answer1);
                break;
            case 3:
                y.price = 5000;
                y.total = y.total+(y.price*answer1);
                break;
            case 4:
                y.price = 13000;
                y.total = y.total+(y.price*answer1);
                break;
            case 5:
                break;     
            default :
                System.out.println("ERROR: Your Input Is Wrong !");
                //memunculkan pesan eror agar apabila user memilih selain ada yang dimenu
                break;
        }       
        return y.total;
    }
    
    void viewTotal() {
        System.out.println("=======================");
        System.out.println("         Payment");
        System.out.println("=======================");
        System.out.println("Pay : " + y.total);
    }
}