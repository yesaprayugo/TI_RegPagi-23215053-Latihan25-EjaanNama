/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class EjaanNama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String namaDepan = scanner.nextLine();

        System.out.println("Ejaan untuk \"" + namaDepan + "\" adalah:");
        for (int i = 0; i < namaDepan.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + namaDepan.charAt(i));
        }
    }
}
