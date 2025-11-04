/*
 * Ad Soyad   : [Sabiha Nur Çay]
 * Ogrenci No : [250541076]
 * Tarih      : [04.11.2005]
 * Aciklama   : Gorev 3 - Maas Hesaplama Sistemi
 *
 * Program: Calisandan ad-soyad, brut maas, haftalik calisma saati ve mesai saatini alir.
 *          Mesai ucretini ve kesintileri hesaplar, net maasi ve istatistikleri
 *          profesyonel bir bordro formatinda gosterir.
 */

import java.util.Scanner;
import java.time.LocalDate;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Sabitler (final) ---
        final double SGK_RATE   = 0.14;     // %14
        final double GV_RATE    = 0.15;     // %15 (Gelir Vergisi)
        final double DV_RATE    = 0.00759;  // %0.759 (Damga Vergisi)
        final double OVERTIME_COEFF = 1.5;  // mesai katsayisi
        final int AVG_MONTHLY_HOURS = 160;  // ayda ort. calisma saati
        final int BUSINESS_DAYS = 22;       // ayda is gunu varsayimi
        final int WEEKS_IN_MONTH = 4;

        // --- Girdiler ---
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");

        System.out.print("Calisan adi soyadi: ");
        String adSoyad = input.nextLine();

        System.out.print("Brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaat = input.nextInt();

        // --- Hesaplamalar ---
        // Mesai ucreti = (Brut Maas / 160) × Mesai Saati × 1.5
        double mesaiUcreti = (brutMaas / AVG_MONTHLY_HOURS) * mesaiSaat * OVERTIME_COEFF;

        // Toplam Gelir
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler (toplam gelir uzerinden)
        double sgkKesinti   = toplamGelir * SGK_RATE;
        double gvKesinti    = toplamGelir * GV_RATE;
        double damgaKesinti = toplamGelir * DV_RATE;

        double toplamKesinti = sgkKesinti + gvKesinti + damgaKesinti;

        // Net Maas
        double netMaas = toplamGelir - toplamKesinti;

        // Istatistikler
        double kesintiOraniYuzde = (toplamKesinti / toplamGelir) * 100.0;
        int toplamSaat = WEEKS_IN_MONTH * haftalikSaat + mesaiSaat; // ay icindeki toplam saat
        double saatlikNetKazanc = toplamSaat > 0 ? (netMaas / toplamSaat) : 0.0;
        double gunlukNetKazanc  = netMaas / BUSINESS_DAYS;

        // --- Cikti ---
        String tarih = LocalDate.now().toString(); // YYYY-MM-DD

        System.out.println("\n====================================");
        System.out.println("         MAAS BORDROSI");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.printf("Tarih  : %s%n%n", tarih);

        System.out.println("GELIRLER:");
        System.out.printf("  %-23s: %10.2f TL%n", "Brut Maas", brutMaas);
        System.out.printf("  Mesai Ucreti (%2d saat) : %10.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  %-23s: %10.2f TL%n%n", "TOPLAM GELIR", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%)  : %10.2f TL%n", SGK_RATE * 100, sgkKesinti);
        System.out.printf("  Gelir Vergisi (%.1f%%)  : %10.2f TL%n", GV_RATE * 100, gvKesinti);
        System.out.printf("  Damga Vergisi (%.1f%%)  : %10.2f TL%n", DV_RATE * 100, damgaKesinti);
        System.out.println("  ------------------------");
        System.out.printf("  %-23s: %10.2f TL%n%n", "TOPLAM KESINTI", toplamKesinti);

        System.out.printf("NET MAAS                 : %10.2f TL%n%n", netMaas);

        System.out.println("ISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %4.1f%%%n", kesintiOraniYuzde);
        System.out.printf("  Saatlik Net Kazanc     : %10.2f TL/saat%n", saatlikNetKazanc);
        System.out.printf("  Gunluk Net Kazanc      : %10.2f TL/gun%n", gunlukNetKazanc);
        System.out.println("====================================");

        input.close();
    }
}
