package Hafta1.Ödev;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;
        System.out.print("Armut Kaç Kilo ? :");
        armut = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = scanner.nextDouble();

        System.out.println("Toplam Tutar : " + (armut*2.14+elma*3.67+muz*0.95+domates*1.11+patlican*5.0) +" TL");
    }
}
