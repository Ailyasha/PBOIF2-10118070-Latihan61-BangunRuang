/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan61.bangunruang;

/**
 *
 * @author Ailyasha
 */
public class PBOIF210118070Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola= new Bola();
        bola.setR(7);
        System.out.println("hasil :" + bola.hitungVolume());
        
        Tabung tabung= new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Hasil :" + tabung.hitungVolume());
        
        Kerucut kerucut= new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Hasil :" + kerucut.hitungVolume());
    }
    
}
