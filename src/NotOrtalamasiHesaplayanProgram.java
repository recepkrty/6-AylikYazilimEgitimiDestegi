import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat, fzk, kmya, trkc, trh, mzk;

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

        System.out.print("Ortalama: " + (mat+fzk+kmya+trkc+trh+mzk)/6);
    }
}
