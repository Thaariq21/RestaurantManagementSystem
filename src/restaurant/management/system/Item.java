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
    
    Item ite[] = new Item[5];
    
    public Item(String namaItem, double harga){
        this.namaItem = namaItem;
        this.harga = harga;
    }
    public String getNamaItem(){
        return namaItem;
    }
    public double getHarga(){
        return harga;
    }
}
