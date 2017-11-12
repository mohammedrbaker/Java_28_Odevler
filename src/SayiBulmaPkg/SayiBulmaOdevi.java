package SayiBulmaPkg;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mohammed on 4/11/2017.
 */
public class SayiBulmaOdevi {
    public static void main(String[] args) {

        Random randomSayi = new Random();
        Scanner scanner = new Scanner(System.in);
        int bilgisayarTahmini = randomSayi.nextInt(100);
        int denemeSayisi = 0;
        int kullaniciTahmini = 0;

        while(true) {
            bilgisayarTahmini = randomSayi.nextInt(100);
            System.out.println("1 ile 100 arasında sayısı giriniz: ");
            denemeSayisi = 0;
           // while (true) {
            for (denemeSayisi = 0; denemeSayisi <5 ; denemeSayisi++) {

                kullaniciTahmini = scanner.nextInt();
               // denemeSayisi++;

                if (kullaniciTahmini < 1 || kullaniciTahmini > 100) System.out.println(" Yanlış giriş!");
                else if (kullaniciTahmini == bilgisayarTahmini) {
                    System.out.println("Bingo buldunuz! " + denemeSayisi + "  kez denediniz ve bilgisayarın tahmin ettiğiniz sayı:  " + bilgisayarTahmini);
                    break;
                }
                else if (denemeSayisi == 4) {
                    System.out.println("Kaybettiniz. Tahmini bulamadınız! " + "  bilgisayarın tuttuğu sayı:  " + bilgisayarTahmini);
                    break;
                }

                else if (kullaniciTahmini < bilgisayarTahmini) System.out.println("Tahmininiz çok küçük!");
                else if (kullaniciTahmini > bilgisayarTahmini) System.out.println("Tahmininiz çok yüksek!");
                //  }
            }

            System.out.println("Tekrar oynamak ister misiniz?  (evet/hayır)");

            if(!scanner.next().equals("evet"))
                break;
        }




    }

}
