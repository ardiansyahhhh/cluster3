/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author fauzi
 */
public class hotel {
    private static final double HARGA_STANDAR = 200.000;
    private static final double HARGA_PREMIUM = 300.000;
    private static final double HARGA_DELUXE = 400.000;
    
    private String nama;
    private int malam;
    private int tipekamar;
    
    public hotel(String nama, int malam, int tipekamar){
        this.nama = nama;
        this.malam = malam;
        this.tipekamar = tipekamar;
    }
    
    public double totalharga(){
        double hargakamar;
        switch(tipekamar){
            case 1:
                hargakamar = HARGA_STANDAR;
                break;
            case 2:
                hargakamar = HARGA_PREMIUM;
                break;
            case 3:
                hargakamar = HARGA_DELUXE;
                break;
            default:
                throw new IllegalArgumentException("Tipe Kamar Yang Tersedia : " +tipekamar);
        }
        
        double totalharga = hargakamar * malam;
        double diskon = 0.0;
        if(malam >= 3 && malam <= 5 ){
            diskon = totalharga * 0.1;
        }else if (malam > 5){
            diskon = totalharga * 0.2;
        }
        
        return totalharga - diskon;
    }
    
    public String toString(){
        return String.format("Nama Pemesan : %s\n" +
                "Lama Menginap(Malam) : %d\n" +
                "Tipe Kamar : %d\n" +
                "Total Harga : Rp%,.3f\n",nama,malam,tipekamar,totalharga());
    }
    
}
