
package sriapril;

/**
 *
 * @author sriap
 */
import java.util.Scanner;

public class sriapril {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Meminta input alas dan tinggi dari user
        System.out.print("Masukkan nilai alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan nilai tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil luas segitiga
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah " + luas);
   
    }
}






    
 