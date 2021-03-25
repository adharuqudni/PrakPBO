/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan1;

/**
 *
 * @author user
 */
public class Mahasiswa {
    String nama,nim;
    private int usia,uts,uas,nilai;
  
    public Mahasiswa(String nama, String nim, int usia, int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
        this.nilai = (uts+uas)/2;
    };
    
    public final String getName(){
     return this.nama;
             };
    public final String getNim(){
     return this.nim;
             };
    public final int getUsia(){
     return this.usia;
             };
    public final int getNilai(){
     return this.nilai;
             };
    
}
