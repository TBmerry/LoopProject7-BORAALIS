import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        double toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Harmoniğini öğrenmek istediğiniz sayıyı giriniz : ");
        a = input.nextInt();

        for (double i = 1; i <= a; i++){
            toplam += (1/i);
        }

        System.out.println(toplam);
    }
}