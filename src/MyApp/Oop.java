/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author Albert Zedrick Dela
 */
public class Oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean run = true;
        
        do{      
            Scanner scan = new Scanner(System.in);
            System.out.println
            ( "=============================\n"
            + "Construction Supply Inventory\n"
            + "=============================\n"
            + "[1] Edit Inventory\n"
            + "[2] Current Order Status\n"
            + "[3] History\n"
            + "=============================\n"
            + "[0] Exit system\n\n"
            + "Choice  : ");
            int choice = scan.nextInt();

            if (choice == 1){
                clearScreen();
                System.out.println("test test");
            }
            else if (choice == 2){
                clearScreen();
                System.out.println("[4]");
            }
            else if (choice == 3){
                clearScreen();
                System.out.println("testing history");
                
            }
            else if (choice == 4){
                clearScreen();
                System.out.println
                ("==================\n"
                + "   System End   \n"
                + "==================\n");
                run = false;
            }
        }while( run == true);
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
}
