/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Kelulusan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek
        Siswa pelajar = new Siswa();
        
        //Pengisian Atrribut
        pelajar.nama = "Anya";
        pelajar.nilai = 80;
        
        //Menjalankan Method
        pelajar.CetakNilai();
        
        //Menentukan Kelulusan
        if(pelajar.lulus()){
            System.out.println("Selamat anda lulus");
        }
        else if(pelajar.tidaklulus()){
            System.out.println("Anda harus belajar lebih giat lagi");
        }else{
        }
}
    
    
}
