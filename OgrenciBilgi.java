/*
 * Ad Soyad: [sabiha nur çay]
 * Ogrenci No: [250541076]
 * Tarih: [28.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner input = new Scanner(System.in);
        
        // Degisken tanimlamalari
        String ad, soyad;
        int ogrenciNo, yas;
        double gpa;
      
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
       
        System.out.print("Adininzi girin: ");
        ad = input.nextLine();

        System.out.print("Soyadinizi girin: ");
        soyad = input.nextLine();

        System.out.print("Ogrenci numaraniz: ");
        ogrenciNo = input.nextInt();

        System.out.print("Yasiniz: ");
        yas = input.nextInt();

        System.out.print("GPA (0.00 - 4.00): ");
        gpa = input.nextDouble();
        

        
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + ad " " + soyad);
        System.out.println("Ogrenci No: " + ogrenciNo);
        System.out.println("Yas: " + yas);
        System.out.printf("GPA: %.2f\n", gpa);

        if(gpa >= 2.0) {
            System.out.println("Durum: Basarili Ogrenci");
        } else {
            System.out.println("Durum: Basarisiz Ogrenci");
        }

        // COZUMUNUZU BURAYA YAZIN
        //Bu program, kullanıcının girdiği öğrenci bilgilerini (ad, soyad, numara, yas ve gpa)
        //Scanner sınıfı ile alır ve ekrana düzenli bir şekilde yazdırır. 
        //GPA değerine göre öğrencinin başarılı veya başarısız olduğu ekranda gösterir.
        
        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
         input.close();
    }
}
