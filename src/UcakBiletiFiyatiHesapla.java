import java.util.Scanner;

public class UcakBiletiFiyatiHesapla {
    public static void main(String[] args) {

        int trw, age, distance;
        double price;
        Scanner data = new Scanner(System.in);

        System.out.print("1=> Tek Yön\n2=> Gidiş Geliş\n\nYolculuk tipini seçiniz :");
        trw = data.nextInt();

        System.out.print("Yaşınızı girin :");
        age = data.nextInt();

        System.out.print("Mesafeyi km cinsinden giriniz :");
        distance = data.nextInt();

        price = distance * 0.10;

        if (trw == 1){
            if ((0 < distance) && (distance < 18000)) {
                if (0 < age && age <=12) {
                    price -= price / 2;
                    System.out.println("\nToplam tutar :" + price);
                }else if (12<age&&age<=24){
                    price -=price*0.1;
                    System.out.println("\nToplam tutar :" + price);
                }else if (24<age&&age<=65){
                    System.out.println("\nToplam tutar :"+price);
                }else if (65<age&&age<120){
                    price -=price*0.3;
                    System.out.println("\nToplan tutar :"+price);
                }else {
                    System.out.println("\nHatalı Veri Girdiniz.");
                }
            } else {
                System.out.println("\nHatalı Veri Girdiniz.");
            }
        }else if (trw==2){
            if ((0 < distance) && (distance < 18000)) {
                if (0 < age && age <=12) {
                    price -= price*0.5;
                    price -= price*0.2;
                    System.out.println("\nToplam tutar :" + price*2);
                }else if (12<age&&age<=24){
                    price -=price*0.1;
                    price -= price*0.2;
                    System.out.println("\nToplam tutar :" + price*2);
                }else if (24<age&&age<=65){
                    System.out.println("\nToplam tutar :"+price*2);
                }else if (65<age&&age<120){
                    price -=price*0.3;
                    price -= price*0.2;
                    System.out.println("\nToplan tutar :"+price*0.2);
                }else {
                    System.out.println("\nHatalı Veri Girdiniz.");
                }
            } else {
                System.out.println("\nHatalı Veri Girdiniz.");
            }
        }
        else {
            System.out.println("\nHatalı Veri Girdiniz.");
        }
    }
}
