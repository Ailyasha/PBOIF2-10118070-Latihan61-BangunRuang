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
public class Bola implements BangunRuang{
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    

    @Override
    public double hitungVolume() {
        return 4*Math.PI*(r*r*r)/3; //To change body of generated methods, choose Tools | Templates.
    }
        
}