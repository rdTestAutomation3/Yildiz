import java.util.ArrayList;
import java.util.List;

class Departman {
    private String ad;
    private List<Personel> personeller;

    public Departman(String ad) {
        this.ad = ad;
        this.personeller = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personeller.add(personel);
    }

    public List<Personel> personelListele() {
        return personeller;
    }
}

class Personel {
    private String ad;
    private String soyad;

    public Personel(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return ad + " " + soyad;
    }
}

public class Main {
    public static void main(String[] args) {
        Departman muhasebe = new Departman("Muhasebe");
        Personel personel1 = new Personel("Ahmet", "Yılmaz");
        Personel personel2 = new Personel("Ayşe", "Kara");
        muhasebe.personelEkle(personel1);
        muhasebe.personelEkle(personel2);

        Departman yazilim = new Departman("Yazılım");
        Personel personel3 = new Personel("Yıldız", "Binici");
        Personel personel4 = new Personel("Zeynep", "Çelik");
        yazilim.personelEkle(personel3);
        yazilim.personelEkle(personel4);

        System.out.println("Muhasebe Departmanındaki Personeller:");
        for (Personel personel : muhasebe.personelListele()) {
            System.out.println(personel);
        }

        System.out.println("Yazılım Departmanındaki Personeller:");
        for (Personel personel : yazilim.personelListele()) {
            System.out.println(personel);
        }
    }
}
