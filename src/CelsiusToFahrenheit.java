import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
        /*
            Örnek Menü Tasarımı:

            Sıcaklık Dönüşüm Uygulaması
            1. Santigrat - Fahrenheit
            2. Fahrenheit - Santigrat
            Seçim :
            -------------------------
            Formül: F=Cx1.8+32
                    C=(F-32)/1.8
             -----------------------
            Örnek;  F=30x1.8+32=86
                    C=(86-32)/1.8=30
            -------------------------
             Ekran Çıktısı:
             30 C --> 86 F
             86 F --> 30 C
         */


        Scanner input = new Scanner(System.in);

        System.out.println("sicaklik degeri giriniz= ");
        int sıcaklıkDegeri = input.nextInt();

        System.out.println("sicaklik degisim uygulamasi");

        System.out.println("--");
        System.out.println("1. c derece Hesapla");
        System.out.println("2. f derece Hesapla");
        System.out.print("Seciminiz: ");
        int secim = input.nextInt();
        System.out.println();
        switch (secim) {
            case 1:
                double C = (sıcaklıkDegeri - 32) / 1.8;
                System.out.println(C + " " + 'C' + "--->" + sıcaklıkDegeri + " " + 'F');
                break;
            case 2:

                Double F = sıcaklıkDegeri * 1.8 + 32;
                System.out.println(F + " " + "F" + "---->" + sıcaklıkDegeri + " " + 'C');

                break;
        }
    }
}