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
    }
}
