/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pbo;

/**
 *
 * @author USER
 */
public class Sepeda extends Kendaraan {
    
    public Sepeda(String nama, int kecepatan) {
        super(nama, kecepatan);  // Memanggil constructor superclass
    }

    // Polymorphism: Implementasi metode abstrak
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan kecepatan " + getKecepatan() + " km/jam.");
    }
}
    

