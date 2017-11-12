package SekilCizmePkg;

import java.util.Scanner;

/**
 * Created by Mohammed on 28/10/2017.
 */
public class SekilCizmeOdevi {
    public static void main(String[] args) {
        int satirSayi;
        int sutunSayi;

        // *****
        // * *
        // * *
        // * *
        // * *
        // *****
        Scanner scanner = new Scanner(System.in);


            System.out.println("Satır sayısı giriniz: ");
            satirSayi = scanner.nextInt();

            while (satirSayi <3 || satirSayi>20) {
                System.out.println("Girdiğiniz satır sayısı 3'den küçük ve 20'den büyük olmamalı, tekrar deneyiniz: ");
                satirSayi=scanner.nextInt();
                continue;
            }

            System.out.println("Sütun sayısı giriniz: ");
            sutunSayi = scanner.nextInt();

            while (sutunSayi <3 || sutunSayi>20) {

                System.out.println("Girdiğiniz sütun sayısı 3'den küçük ve 20'den büyük olmamalı, tekrar deneyiniz: ");
                sutunSayi=scanner.nextInt();
                continue;

            }

             for (int i = 0; i < satirSayi; i++) {
                  for (int j = 0; j < sutunSayi; j++) {
                       if(i==0 || i==satirSayi-1 || j==0 || j==sutunSayi-1) {
                           System.out.print("*");
                       }
                       else {
                            System.out.print(" ");
                            }
                  }
            System.out.println("");
             }
    }

}