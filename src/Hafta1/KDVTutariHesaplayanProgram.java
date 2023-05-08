package Hafta1;

import java.util.Scanner;
public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float kdv;
        System.out.print("Miktar giriniz: ");
        int input = scanner.nextInt();

        kdv = (input > 1000) ? 0.08f : 0.18f;
        System.out.println("KDV Tutarı : " + (input*kdv));
        System.out.println("KDV'li Fiyat : " + (input*(kdv+1)));
    }
}
