import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class KelimeDizisi {
    public static void main(String[] args) {
        String[] kelimeler = {"aramak", "kamera", "makarna", "karalama", "kamera", "deneme", "aramak"};

        // Tekrarlı kelimeleri say
        HashMap<String, Integer> kelimeSayisi = new HashMap<>();
        for (String kelime : kelimeler) {
            kelimeSayisi.put(kelime, kelimeSayisi.getOrDefault(kelime, 0) + 1);
        }

        System.out.println("Tekrarlı kelimeler:");
        for (String kelime : kelimeSayisi.keySet()) {
            if (kelimeSayisi.get(kelime) > 1) {
                System.out.println(kelime + ": " + kelimeSayisi.get(kelime) + " kez");
            }
        }

        int tekrarEdenKelimeSayisi = 0; // Tekrar eden kelime sayısını tutacak
        String kelime1 = "", kelime2 = "";

        for (String kelime : kelimeler) {
            // Eğer kelimede tekrar eden harf varsa
            if (hasDuplicateLetters(kelime)) {
                if (tekrarEdenKelimeSayisi == 0) {
                    kelime1 = kelime; // İlk kelimeyi al
                } else if (tekrarEdenKelimeSayisi == 1) {
                    kelime2 = kelime; // İkinci kelimeyi al
                }

                System.out.println("Tekrar eden harfler bulunan kelime: " + kelime);
                tekrarEdenKelimeSayisi++;

                // Eğer iki kelimede de tekrar eden harf varsa döngüyü bitir
                if (tekrarEdenKelimeSayisi == 2) {
                    break;
                }
            }
        }

        // İki kelimenin tüm harflerini birleştirip yazdır
        if (tekrarEdenKelimeSayisi == 2) {
            String birlesikHarfler = kelime1 + kelime2; // Kelimeleri birleştir
            ArrayList<Character> harflerDizisi = new ArrayList<>(); // Tekrar eden harfler için dizi
            for (char harf : birlesikHarfler.toCharArray()) {
                if (!harflerDizisi.contains(harf)) {
                    harflerDizisi.add(harf); // Harfi ekle
                }
            }

            // Harfleri yazdır
            System.out.print("Birleştirilmiş harfler dizisi: {");
            for (int i = 0; i < harflerDizisi.size(); i++) {
                System.out.print(harflerDizisi.get(i));
                if (i < harflerDizisi.size() - 1) {
                    System.out.print(", "); // Virgül ekle
                }
            }
            System.out.println("}");

            // Rastgele bir kelime oluştur (tüm harfleri bir kez kullanarak)
            String randomKelime = generateRandomWord(harflerDizisi); // Tüm harfleri kullan
            System.out.println("Rastgele oluşturulan kelime: " + randomKelime);
        }
    }

    // Tekrar eden harf var mı kontrol eden metod
    private static boolean hasDuplicateLetters(String kelime) {
        HashMap<Character, Integer> harfSayisi = new HashMap<>();
        for (char harf : kelime.toCharArray()) {
            harfSayisi.put(harf, harfSayisi.getOrDefault(harf, 0) + 1);
        }
        // Eğer en az bir harf 2 veya daha fazla kez varsa true döner
        for (int sayi : harfSayisi.values()) {
            if (sayi > 1) {
                return true;
            }
        }
        return false;
    }

    // Rastgele kelime oluşturan metod
    private static String generateRandomWord(ArrayList<Character> harfler) {
        Collections.shuffle(harfler); // Harfleri karıştır
        StringBuilder randomKelime = new StringBuilder();

        for (char harf : harfler) {
            randomKelime.append(harf); // Karıştırılmış harfleri ekle
        }

        return randomKelime.toString();
    }
}
