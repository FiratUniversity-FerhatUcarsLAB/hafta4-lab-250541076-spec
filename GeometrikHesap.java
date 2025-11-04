/*
 *Ad Soyad: Sabiha Nur Çay
 *Ogrenci No: 250541076
 *Tarih: 28.10.2025
 *Açıklama: Görev 2 - Geometrik Hesaplayıcı
 *Bu program, kullanıcıdan dairenin yarıçapını alarak 
 *dairenin alanının, çevresini, çapını ve aynı yarıçapla bir kürenin
 *hacmini ve yüzey alanını hesaplayıp ekrana 2 ondalıklı biçimde yazdırır.
 */

import java.util.Scanner;

public class GeometrikHesap {
  public static void main (String[] args) {

    //Pi sayısını sabit olarak tanımla
    final souble Pi = 3.14159;

    //Değişken tanımlamaları
    double yaricap;
    double daireAlani, daireCevresi, daireCapi;
    double kureHacmi, kureYuzeyAlani;

    //Kullanıcıdan yarıçap değerini al
    Scanner input = new Scanner(System.in);
    System.out.println("=== GEOMETRIK HESAPLAYICI ===");
    System.out.print("Dairenin yaricapini girin (cm): ");
    yaricap = input.nextDouble();

    //Hesaplamalar
    daireAlani = Pi * yaricap * yaricap;
    daireCevresi = 2 * Pi * yaricap;
    kureHacmi = 2 * yaricap;
    kureYuzeyAlani = 4 * Pi * yaricap * yaricap;

    //Sonuçları yazdır
    System.out.println("\nSONUÇLAR:");
    System.out.printf("Daire Alani      : %.2f cm²%n", daireAlani);
    System.out.printf("Daire Cevresi    : %.2f cm%n, daireCevresi);
    System.out.printf("Kure Hacmi       : %.2f cm%n, kureHacmi);
    System.out.printf("Kure Yuzey Alani : %.2f cm²%n, KureYuzeyAlani);

    input.close();
  }
}
