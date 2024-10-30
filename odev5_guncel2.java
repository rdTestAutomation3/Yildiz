import java.util.Scanner;

class Personel {
    private String isim;
    private int calisilanGunSayisi;
    private double gunlukMaas;

    public Personel(String isim, int calisilanGunSayisi, double gunlukMaas) {
        this.isim = isim;
        this.calisilanGunSayisi = calisilanGunSayisi;
        this.gunlukMaas = gunlukMaas;
    }

    public String getIsim() {
        return isim;
    }

    public int getCalisilanGunSayisi() {
        return calisilanGunSayisi;
    }

    public double getGunlukMaas() {
        return gunlukMaas;
    }

    public double aylikMaasHesapla() {
        return calisilanGunSayisi * gunlukMaas;
    }

    public int primHesapla() {
        return (calisilanGunSayisi > 25) ? (calisilanGunSayisi - 25) * 1000 : 0;
    }
}

class MuhasebeDepartmani {
    public void personelMaasBilgisiGoster(Personel personel) {
        System.out.println("Personel: " + personel.getIsim());

        if (personel.getCalisilanGunSayisi() < 0) {
            System.out.println("Hata: Çalışılan gün sayısı 0'dan büyük olmalıdır.");
        } else if (personel.getCalisilanGunSayisi() > 31) {
            System.out.println("Hata: Bir ayda çalışılan gün sayısı 31'den fazla olamaz.");
        } else {
            double aylikMaas = personel.aylikMaasHesapla();
            System.out.println("Aylık maaşınız: " + aylikMaas + " TL");

            int prim = personel.primHesapla();
            System.out.println(prim > 0 
                ? "Toplam priminiz: " + prim + " TL"
                : "Çalışılan gün sayısı 25'ten fazla olduğunda prim alınabilir.");
        }
    }
}

public class MaasHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Personel adını giriniz: ");
        String isim = scanner.nextLine();

        System.out.print("Çalıştığınız gün sayısını giriniz: ");
        int gunSayisi = scanner.nextInt();

        System.out.print("Günlük maaşınızı giriniz: ");
        double gunlukMaas = scanner.nextDouble();

        scanner.close();

        Personel personel = new Personel(isim, gunSayisi, gunlukMaas);
        MuhasebeDepartmani muhasebe = new MuhasebeDepartmani();
        muhasebe.personelMaasBilgisiGoster(personel);
    }
}
