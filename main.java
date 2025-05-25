import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String adSoyad = "Aslı Nur MAVİLİ";
        int yas = 26;
        double maas = 19000.50;
        float boy = 1.58f;
        boolean mezunMu = true;
        char cinsiyet = 'K';

        final double PI = 3.14159;

        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Boy: " + boy + " m");
        System.out.println("Maaş: " + maas + " TL");
        System.out.println("Mezun mu?: " + mezunMu);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Pi sayısı (sabit): " + PI);

        Scanner input = new Scanner(System.in);



        // Aritmetik işlemler
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = input.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = input.nextDouble();

        double toplam = sayi1 + sayi2;
        double fark = sayi1 - sayi2;
        double carpim = sayi1 * sayi2;
        double bolum = sayi2 != 0 ? sayi1 / sayi2 : 0;

        System.out.println("\n--- İşlem Sonuçları ---");
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);

        if (sayi2 != 0) {
            System.out.println("Bölüm: " + bolum);
        } else {
            System.out.println("Bölüm: Sıfıra bölme hatası!");
        }




        // if-else
        System.out.print("\nBir sayı girin: ");
        int sayi = input.nextInt();

        if (sayi > 0) {
            System.out.println("Pozitif sayı");
        } else if (sayi < 0) {
            System.out.println("Negatif sayı");
        } else {
            System.out.println("Sayı sıfır");
        }

        input.close();
    }
}
