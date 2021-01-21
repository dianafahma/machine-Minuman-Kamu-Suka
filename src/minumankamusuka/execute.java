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
public class execute {
    showMenu y = new showMenu();

    public double executeCashback(double payment) {
        y.pay = payment;
        y.cashback = payment - y.total;
        return y.cashback;
    }
    
    public void viewCashback() {
        System.out.println("Cashback : " + y.cashback);
        System.out.println("==== Your Cashback ====");
    }
    
    void viewTotal() {
        System.out.println("=======================");
        System.out.println("         Payment");
        System.out.println("=======================");
        System.out.println("Pay : " + y.cashback);
    }
}
