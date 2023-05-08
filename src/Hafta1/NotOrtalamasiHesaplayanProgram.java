package Hafta1;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat, fzk, kmya, trkc, trh, mzk, ort;
        String durum;

        System.out.print("Matematik notu : ");
        mat = scanner.nextInt();

        System.out.print("Fizik notu : ");
        fzk = scanner.nextInt();

        System.out.print("Kimya notu : ");
        kmya = scanner.nextInt();

        System.out.print("Türkçe notu : ");
        trkc = scanner.nextInt();

        System.out.print("Tarih notu : ");
        trh = scanner.nextInt();

        System.out.print("Müzik notu : ");
        mzk = scanner.nextInt();

        ort = (mat+fzk+kmya+trkc+trh+mzk)/6;
        System.out.println("Ortalama: " + ort);
        durum = (ort > 60) ? "Geçtiniz !" : "Kaldınız !";
        System.out.println(durum);
    }
}
