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
public class Tabung implements BangunRuang {
    private int r,t;
    
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Override
    public double hitungVolume() {
        return Math.PI*(r*r)*t; //To change body of generated methods, choose Tools | Templates.
    }
    
}
