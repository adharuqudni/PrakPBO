/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        Mahasiswa mahasiswa = null;
        int pilihan = 2;
        while(true){
            if (pilihan == 1) {
                System.out.println("\n\nPerkenalkan Nama saya "
                        + mahasiswa.getName()
                        + ", nim "
                        + mahasiswa.getNim());
                System.out.println("Usia\t\t:"+mahasiswa.getUsia());
                System.out.println("NilaiAkhir\t:"+mahasiswa.getNilai());
            }else if (pilihan == 2) {
                System.out.println("Edit/Input Data====");
                String nama,nim;
                int usia,uts,uas,nilai;
                System.out.println("Nama\t: "); 
                nama = sc.next();
                System.out.println("NIM\t: "); 
                nim = sc.next();
                System.out.println("Usia\t: "); usia = sc.nextInt();
                System.out.println("UTS\t: "); uts = sc.nextInt();
                System.out.println("UAS\t: "); uas = sc.nextInt();
                mahasiswa = new Mahasiswa(nama,nim,usia,uts,uas);
            }else{
                return;
            }
            System.out.println("\n\nOpsi====");
            System.out.println("1.TampilkanData");
            System.out.println("2.Edit data");
            System.out.println("3.Exit");
            System.out.println("Pilih: ");
            pilihan = sc.nextInt();
        }
    }
    
}
