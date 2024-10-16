import java.util.Scanner;

class MaasHesaplama {
    public static void main(String[] args) {

        Scanner sorgu = new Scanner(System.in);
        System.out.print("Çalıştığınız gün sayısını giriniz: ");
        int gunSayisi = sorgu.nextInt();
        System.out.println("Günlük maaşınızı giriniz");
        double gunluk = sorgu.nextDouble();
        double Aylik;
        
            if (gunSayisi > 0 && gunSayisi <=25) 
                {
                    Aylik = gunSayisi * gunluk;
                    System.out.println("Aylık maaşınız: " + Aylik);
                    String mesaj1 = ("Çalışılan gün sayısı 25'ten fazla olduğunda prim alınabilir.");
                    System.out.println(mesaj1);
            if (gunSayisi > 31)
                {
                    String mesaj2 = ("Hata:Bir ayda çalışılan gün sayısı 31'den fazla olamaz");
                    System.out.println(mesaj2);                 
            if (gunSayisi <0 )
                {
                    String mesaj3 = ("Maaşın hesaplanabilmesi için çalışılan gün sayısı 0'dan büyük olmalıdır.");
                    System.out.println(mesaj3);
            else{
                    int prim = (gunSayisi > 25) ? ((gunSayisi-25) * 1000) : 0;
                    System.out.println("Toplam Priminiz: " + prim + "TL");
                }
            }
        }
                }












