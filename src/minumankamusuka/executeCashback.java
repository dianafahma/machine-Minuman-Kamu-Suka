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
public class executeCashback {
    showMenu y = new showMenu();

    double executeCashback(double payment) {
        y.pay = payment;
        y.cashback = payment - y.total;
        return y.cashback;
    }
    
    void viewCashback() {
        System.out.println("Cashback : " + y.cashback);
        System.out.println("==== Your Cashback ====");
    }
}
