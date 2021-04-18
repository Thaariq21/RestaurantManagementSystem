/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management.system;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        
        
        
        int pilih = 99; 
        while(pilih != 0){
            System.out.println("==== Restoran NoName ====");
            System.out.println("1.Menu");
            System.out.println("2.order");
            
            pilih = input.nextInt();
            
        }
        
       
    }
    
}
