/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pbo;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        // Polymorphism: Menggunakan referensi superclass untuk objek subclass
        Kendaraan mobil = new Mobil("Mobil Sport", 120);
        Kendaraan motor = new Motor("Motor Balap", 100);
        Kendaraan sepeda = new Sepeda("Sepeda Gunung", 30);

        // Memanggil metode bergerak pada berbagai objek
        mobil.bergerak();
        motor.bergerak();
        sepeda.bergerak();
    }
}