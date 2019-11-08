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
public class Detektif extends Film{
        public Detektif(String nama,String tokoh) {
        super(nama,tokoh);
        
    }
    
    public void tampilDeetective(){
        
        Detektif obj2 = new Detektif("Hirosi Agasa","Detektif ");
        System.out.println("Tokoh : "+obj2.tokoh);
        System.out.println("1. "+obj2.nama);
        System.out.println("2. Genta Kojima");
        System.out.println("3. Mitsuhiko Tsuburaya");
        System.out.println("4. Ai Haibara");
        System.out.println("5. Conan edogawa");
        System.out.println("6. Ayumi Yoshida");
        
        
    }  
}
