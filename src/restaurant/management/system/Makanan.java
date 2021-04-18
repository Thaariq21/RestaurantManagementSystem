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
public class Makanan extends Item{
    
    public Makanan(String namaItem, double harga) {
        super(namaItem, harga);
    }
    
    @Override
    public void showMenu(){
        System.out.println("=========== MENU ===========");
        System.out.println("Makanan");
        //    System.out.println("----------------------------");
        for (int i = 0; i < 5; i++) {
           System.out.println((i + 1) + ". " + itemMakan[i].getNamaItem() + " " + itemMakan[i].getHarga());
        }
    }
}
