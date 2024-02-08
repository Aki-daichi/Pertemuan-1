/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author dzaka
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 42;
        String s = (i<40)?"Life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
    
}

/*
    * (i < 40): Kondisi ini memeriksa apakah i kurang dari 40. Karena i adalah 42, maka kondisi ini false.
    * (i > 50): Kondisi ini memeriksa apakah i lebih besar dari 50. Karena i adalah 42, kondisi ini juga false.
Karena kedua kondisi tersebut bernilai false, maka Ternary operator  memilih value  setelah tanda titik dua (" : ")
sebagai hasilnya. Jadi, value "everything" ditetapkan ke variabel s. Hasilnya, pernyataan System.out.println(s); 
mencetak value s, yaitu "everything"
*/