public class  SayiTopOrt {
    public static void main(String[] args) {
        float toplam = 0;
        int i;
        for (i=1; i<=1000; i++) {
            toplam += i;
        }
        float ortalama = toplam/i;
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);
    }
}