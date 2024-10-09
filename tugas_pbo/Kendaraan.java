/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pbo;

/**
 *
 * @author USER
 */
public abstract class Kendaraan {
    
    private String nama;  
    private int kecepatan;

    public Kendaraan(String nama, int kecepatan) {  // Constructor
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    // Encapsulation: Getter untuk mengakses data private
    public String getNama() {
        return nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // Abstraction: Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract void bergerak();
}