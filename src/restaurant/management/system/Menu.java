/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management.system;

/**
 *
 * @author ahmad nur hidaya
 */
import java.util.Scanner;

public class Menu {
    Item item[] = new Item[5];
    Scanner input = new Scanner(System.in);
    
    public Menu(){
        generateMenu();
    }
    public void generateMenu(){
        item[0] = new Item("Nasi kuning", (double) 15000);
        item[1] = new Item("Nasi Goreng", (double) 15000);
        item[2] = new Item("Mie Ayam", (double) 13000);
        item[3] = new Item("Bakso", (double) 10000);
        item[4] = new Item("Nasi Campur", (double) 20000);
    }
}
