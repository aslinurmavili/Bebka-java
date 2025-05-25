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
        System.out.print("\nBirinci sayıyı girin: ");
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

        // tek-çift kontrol
        if (sayi % 2 == 0) {
            System.out.println(sayi + " bir çift sayıdır.");
        } else {
            System.out.println(sayi + " bir tek sayıdır.");
        }

        // switch-case ile harf notu
        System.out.print("\n0-100 arasında bir not girin: ");
        int not = input.nextInt();

        char harfNot;
        switch (not / 10) {
            case 10:
            case 9:
                harfNot = 'A';
                break;
            case 8:
                harfNot = 'B';
                break;
            case 7:
                harfNot = 'C';
                break;
            case 6:
                harfNot = 'D';
                break;
            default:
                harfNot = 'F';
        }

        System.out.println("Harf Notu: " + harfNot);





        //For göngüsü
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }


        //while döngüsü
        int sayac = 10;

        while (sayac >= 1) {
            System.out.println(sayac);
            sayac--;
        }



        // 5 elemanlı dizi
        int[] sayilar = {10, 20, 30, 40, 50};


        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Dizi elemanı [" + i + "]: " + sayilar[i]);
        }




        // En büyük sayıyı bulma
        System.out.print("\n1. sayıyı girin: ");
        int s1 = input.nextInt();

        System.out.print("2. sayıyı girin: ");
        int s2 = input.nextInt();

        System.out.print("3. sayıyı girin: ");
        int s3 = input.nextInt();

        int enBuyuk;

        if (s1 >= s2 && s1 >= s3) {
            enBuyuk = s1;
        } else if (s2 >= s1 && s2 >= s3) {
            enBuyuk = s2;
        } else {
            enBuyuk = s3;
        }

        System.out.println("En büyük sayı: " + enBuyuk);

        input.close();


    }
}
