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
public class Minuman extends Item{
    

    public Minuman(String namaItem, double harga) {
        super(namaItem, harga);
    }
    
    public void showMenu() {
        System.out.println("=========== MENU ===========");
        System.out.println("Minuman");
        //    System.out.println("----------------------------");
        for (int i = 0; i < 5; i++) {
           System.out.println((i + 1) + ". " + itemMinum[i].getNamaItem() + " " + itemMinum[i].getHarga());
        }
    }
    
    
}
