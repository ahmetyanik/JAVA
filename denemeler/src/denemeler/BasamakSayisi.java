package denemeler;
import java.util.Scanner;
public class  BasamakSayisi {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();
        int basamak = 0;
        while(sayi>0) {
            sayi = sayi/10;
            basamak++;
        }
        System.out.print("Basamak sayisi: " + basamak);
    }
}
