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
public class Item {
    
    private String namaItem;
    private double harga;
    public Item(String namaItem, double harga){
        this.namaItem = namaItem;
        this.harga = harga;
    }
    Item itemMinum[] = new Item[5];
    Item itemMakan[] = new Item[5];
    
    public String getNamaItem(){
        return namaItem;
    }
    public double getHarga(){
        return harga;
    }
    public void generateMenuMin(){
        itemMinum[0] = new Item("Es teh",(double) 3000);
        itemMinum[1] = new Item("Jus Alpukat",(double) 13000);
        itemMinum[2] = new Item("Jus Jeruk",(double) 13000);
        itemMinum[3] = new Item("Thai tea",(double) 10000);
        itemMinum[4] = new Item("Chocholate",(double) 15000);
    }
    public void generateMenuMak(){
        
    }
}
