import java.util.Scanner;

class MaasHesaplama 
{
    public static void main(String[] args)
    {
        Scanner sorgu = new Scanner(System.in);
        System.out.print("Çalıştığınız gün sayısını giriniz: ");
        int gunSayisi = sorgu.nextInt();
        System.out.println("Günlük maaşınızı giriniz");
        double gunluk = sorgu.nextDouble();      
        double Aylik;

        if (gunSayisi < 0)
        {
            System.out.println ("Maaşın hesaplanabilmesi için çalışılan gün sayısı 0'dan büyük olmalıdır.");
        }   
            else if (gunSayisi > 31)
                {
                    System.out.println ("Hata:Bir ayda çalışılan gün sayısı 31'den fazla olamaz");
                }   
                    else 
                        {
                            Aylik = gunSayisi * gunluk;
                        if (gunSayisi > 25) {
                            System.out.println("Aylık maaşınız: " + Aylik + "TL");
                            int prim = (gunSayisi-25) * 1000;
                            System.out.println("Toplam Priminiz: " + prim + "TL");
                        }
                            else         
                                {
                                    System.out.println("Aylık maaşınız: " + Aylik + "TL");                                  
                                    System.out.println("Çalışılan gün sayısı 25'ten fazla olduğunda prim alınabilir.");
                                }
                        
                        }          
    }
}
