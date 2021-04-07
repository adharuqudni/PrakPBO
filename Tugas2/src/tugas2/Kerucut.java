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
public class Kerucut extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Kerucut(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return this.luas()*this.tinggi/3;
    }

    @Override
    public double luasPermukaan() {
        double res = (this.tinggi*this.tinggi)+(this.getJari()*this.getJari());
        double s = Math.sqrt(res);
        return (this.luas())+(Math.PI*this.getJari()*s);
    }
    
}
