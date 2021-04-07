/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author user
 */
public class Lingkaran implements MenghitungBidang{
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }
     
    @Override
    public double luas() {
        return Math.PI*this.jari*this.jari;
    }

    @Override
    public double keliling() {
        return Math.PI*this.jari*2;
    }
    
}
