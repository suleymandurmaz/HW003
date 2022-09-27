import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen sayı kadar yıldızı ekrana tablo halinde yazan bir program yazınız.
        /*
            Ekran:
            Yıldız Adedi:
            Sütun Adedi :


            Örnek;
            Yıldız Adedi: 54
            Sütun Adedi : 12
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Yildiz adedi =");
        int yildiz = input.nextInt();
        System.out.print("Sutun adedi= ");
        int sutun = input.nextInt();

        for (int i = 0; i < yildiz; i++) {
            System.out.print("*\t");
            if (i % sutun == 0) {
                System.out.print("\n");

            }
        }
    }
}
