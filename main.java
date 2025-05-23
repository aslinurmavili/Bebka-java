import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String adSoyad = "Aslı Nur MAVİLİ";
        int yas = 26;
        double maas = 19000.50;
        float boy = 1.58f;
        boolean mezunMu = true;
        char cinsiyet = 'K';

        // final ile tanımlanan değişkenin değeri sonradan değiştirilemez (sabit)
        final double PI = 3.14159;

        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Boy: " + boy + " m");
        System.out.println("Maaş: " + maas + " TL");
        System.out.println("Mezun mu?: " + mezunMu);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Pi sayısı (sabit): " + PI);





        //Aritmetik işlemler + kullanıcıdan veri alma + if-else kullanımı
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin: ");
        double sayi1 = input.nextDouble(); //nextDouble() ile kullanıcıdan ondalıklı veya tam sayılar alınabilir.

        System.out.println("İkinci sayıyı girin: ");
        double sayi2 = input.nextDouble();

        double toplam = sayi1 + sayi2;
        double fark = sayi1 - sayi2;
        double carpim = sayi1 * sayi2;
        double bolum = sayi2 != 0 ? sayi1 / sayi2 : 0; // Sıfıra bölme kontrolü

        System.out.println("\n--- İşlem Sonuçları ---");
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);

        if (sayi2 != 0) {
            System.out.println("Bölüm: " + bolum);
        } else {
            System.out.println("Bölüm: Sıfıra bölme hatası!");
        }

        input.close();
    }
}
