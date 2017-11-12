package BankamatikPkg;

import java.util.Scanner;

/**
 * Created by Mohammed on 10/11/2017.
 */
public class Bankamatik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen hesap numaranızı giriniz: ");
        int kullaniciHesapNo = scanner.nextInt();
        System.out.println("Lütfen Şifrenizi giriniz: ");
        int kullaniciSifre = scanner.nextInt();
        ATMGirisKontrol(kullaniciHesapNo, kullaniciSifre);

    }


    public static void ATMGirisKontrol(int hesapNo, int sifre) {
        // Kullanıcının kayıtlı olup olmadığı kontrolü burada olacak
        int kullaniciHesapNo[] = {11, 22, 33, 44, 55};
        int kullaniciSire[] = {123, 456, 789, 809, 234};
        boolean kontrol = false;
        for (int i = 0; i < 5; i++) {

            if (kullaniciHesapNo[i] == hesapNo && kullaniciSire[i] == sifre) {
                // System.out.println("Tamam hesap no ve şifre: " + kullaniciHesapNo[i] + " " + kullaniciSire[i]);

                //Para giriş ekranı burada çağırılacak
                ATMParaCekme();
                kontrol = true;
            }
        }

        if (!kontrol) {
            System.out.println("Siz bizim kullanıcımız değilsiniz!!");
        }
        System.out.println(" ");
    }

    public static void ATMParaCekme() {
        // ATM'nin içindeki toplam para burada olacak
        int ATMToplam = 10000;

        int banknotSayisi200 = 10;
        int banknotSayisi100 = 20;
        int banknotSayisi50 = 40;
        int banknotSayisi20 = 100;
        int banknotSayisi10 = 200;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Merhaba .. Lütfen çekmek istediğiniz para miktarını giriniz: ");
        int kullaniciParaMiktar = scanner.nextInt();
        if (kullaniciParaMiktar < 10) {
            System.out.println("Yanlış miktar! Lütfen 10 ve üzeri bir miktar giriniz: ");
            ATMParaCekme();

        }
        if (kullaniciParaMiktar > ATMToplam) {
            System.out.println("Girdiğiniz miktar ATM'de bulunmamaktadır. Lütfen daha küçük bir miktar giriniz: ");
            ATMParaCekme();

        } else {

            int banknotAdedi200Luk = 0;
            int banknotAdedi100Luk = 0;
            int banknotAdedi50Lik = 0;
            int banknotAdedi20Lik = 0;
            int banknotAdedi10Luk = 0;


            for (int i = 0; i <= 370; i++) {
                if (kullaniciParaMiktar >= 200 && banknotSayisi200 != 0) {
                    kullaniciParaMiktar = kullaniciParaMiktar - 200;
                    banknotSayisi200 = banknotSayisi200 - 1;
                    banknotAdedi200Luk = banknotAdedi200Luk + 1;
                } else if (kullaniciParaMiktar >= 100 && banknotSayisi100 != 0) {
                    kullaniciParaMiktar = kullaniciParaMiktar - 100;
                    banknotSayisi100 = banknotSayisi100 - 1;
                    banknotAdedi100Luk = banknotAdedi100Luk + 1;

                } else if (kullaniciParaMiktar >= 50 && banknotSayisi50 != 0) {
                    kullaniciParaMiktar = kullaniciParaMiktar - 50;
                    banknotSayisi50 = banknotSayisi50 - 1;
                    banknotAdedi50Lik = banknotAdedi50Lik + 1;

                } else if (kullaniciParaMiktar >= 20 && banknotSayisi20 != 0) {
                    kullaniciParaMiktar = kullaniciParaMiktar - 20;
                    banknotSayisi20 = banknotSayisi20 - 1;
                    banknotAdedi20Lik = banknotAdedi20Lik + 1;

                } else if (kullaniciParaMiktar >= 10 && banknotSayisi10 != 0) {
                    kullaniciParaMiktar = kullaniciParaMiktar - 10;
                    banknotSayisi10 = banknotSayisi10 - 1;
                    banknotAdedi10Luk = banknotAdedi10Luk + 1;
                }
            }
            int toplamCekilenMiktar = (banknotAdedi200Luk * 200 + banknotAdedi100Luk * 100
                    + banknotAdedi50Lik * 50 + banknotAdedi20Lik * 20 + banknotAdedi10Luk * 10);
            ATMToplam = ATMToplam - toplamCekilenMiktar;
            System.out.println("Toplam Çekilen Miktar: " + toplamCekilenMiktar);
            System.out.println("ATM'deki kalan para miktarı: " + ATMToplam);
            System.out.println("----------------------");

            System.out.println("200TL: " + banknotAdedi200Luk);
            System.out.println("100TL: " + banknotAdedi100Luk);
            System.out.println("50TL: " + banknotAdedi50Lik);
            System.out.println("20TL: " + banknotAdedi20Lik);
            System.out.println("10TL: " + banknotAdedi10Luk);
            System.out.println("----------------------");
            System.out.println("Toplam: " + toplamCekilenMiktar);

        }


    }

}
