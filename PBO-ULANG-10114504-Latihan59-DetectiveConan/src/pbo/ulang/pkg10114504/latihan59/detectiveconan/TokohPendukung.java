/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program menampilkan untuk menampilkan biodata karakter dari 
 * detektif conan
 */
public class TokohPendukung extends Film{
    
        public TokohPendukung(String nama,String tokoh) {
        super(nama,tokoh);
    }
    public void tampilTokohPendukung(){
        TokohPendukung obj1 = new TokohPendukung("Kazuha Toyama","Pendukung");
        System.out.println("tokoh : "+obj1.tokoh);
        System.out.println("1. "+obj1.nama);
        System.out.println("2. Heiji Hatori");
        System.out.println("3. Sonoko Suzuki");
        System.out.println("4. Eri Kisaki");
    }  
}
