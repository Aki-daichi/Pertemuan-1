/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author dzaka
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);
        
        System.out.println("Hasil 1"+hasil);
    }
    
}

/*
•   “Hasil 1” adalah Output string.
•   “-125” adalah hasil penjumlahan ¬angka1 dan angka2,
        Ketika angka1 ditambahkan dengan angka2, hasilnya adalah 131, yang berada di luar jangkauan byte. 
        Menurut aturan Java untuk aritmatika bilangan bulat, ketika hasil operasi melebihi nilai maksimum untuk 
        suatu tipe data, maka hasil operasi tersebut akan dibungkus ke nilai minimum. Dalam kasus byte, hasil 
        operasi tersebut akan dibungkus dari 127 hingga -128. Jadi, 131 - 256 sama dengan -125. (Krimgen, 2024)
•   Tidak ada spasi dalam string, oleh karena itu outputnya “disatukan” 

*/