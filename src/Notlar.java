import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
        /*
            Vize Notu :
            Final Notu :

            Formül: not=Vize Notu x 0.4 + Final Notu x 0.6
            Harfler:
                A 90-100
                B 80-89
                C 70-79
                D 60-69
                F 0-59

            Örnek Ekran Çıktısı:

            Not : 80 [B]

         */
        Scanner input=new Scanner(System.in);
        int vizeNot, finalNot;
        double ortalama;
        String durum = "";
        System.out.print("Vize Notunuzu Girin=");
        vizeNot = input.nextInt();
        System.out.print("Final Notunuzu Girin : ");
        finalNot = input.nextInt();
        ortalama = vizeNot * 0.4 + finalNot * 0.6;



        char notHarf = ortalama < 60 ? 'F' : ortalama < 70 ? 'D' : ortalama < 80 ? 'C' : ortalama < 90 ? 'B' : ortalama< 100 ? 'A' : 'G';
        System.out.println("Ortalama : " + ortalama+ "--->" + notHarf);
    }
}
