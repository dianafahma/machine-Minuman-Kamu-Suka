/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minumankamusuka;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author Asus
 */
public class mainApp { 
    public static void main(String[] args) throws IOException { 
        showMenu show = new showMenu();
        boolean isRunning = true;
        do {
            show.showMenu();
        } while (isRunning);       
    }
}
