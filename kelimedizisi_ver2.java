import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class KelimeDizisi {
    public static void main(String[] args) {
        String[] kelimeler = {"aramak", "kamera", "makarna", "karalama", "kamera", "deneme", "aramak"};
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
        int tekrarEdenKelimeSayisi = 0; 
        String kelime1 = "", kelime2 = "";

        for (String kelime : kelimeler) {

            if (hasDuplicateLetters(kelime)) {
                if (tekrarEdenKelimeSayisi == 0) {
                    kelime1 = kelime;
                } else if (tekrarEdenKelimeSayisi == 1) {
                    kelime2 = kelime; 
                }
                System.out.println("Tekrar eden harfler bulunan kelime: " + kelime);
                tekrarEdenKelimeSayisi++;
              
                if (tekrarEdenKelimeSayisi == 2) {
                    break;
                }
            }
        }
        if (tekrarEdenKelimeSayisi == 2) {
            String birlesikHarfler = kelime1 + kelime2; 
            ArrayList<Character> harflerDizisi = new ArrayList<>(); 
            for (char harf : birlesikHarfler.toCharArray()) {
                if (!harflerDizisi.contains(harf)) {
                    harflerDizisi.add(harf); 
                }
            }
            System.out.print("Birleştirilmiş harfler dizisi: {");
            for (int i = 0; i < harflerDizisi.size(); i++) {
                System.out.print(harflerDizisi.get(i));
                if (i < harflerDizisi.size() - 1) {
                    System.out.print(", "); 
                }
            }
            System.out.println("}");

            String randomKelime = generateRandomWord(harflerDizisi);
            System.out.println("Rastgele oluşturulan kelime: " + randomKelime);
        } else {
            System.out.println("İki tekrarlı harf bulunan kelime bulunamadı.");
        }
    }
    private static boolean hasDuplicateLetters(String kelime) {
        HashMap<Character, Integer> harfSayisi = new HashMap<>();
        for (char harf : kelime.toCharArray()) {
            harfSayisi.put(harf, harfSayisi.getOrDefault(harf, 0) + 1);
        }
        for (int sayi : harfSayisi.values()) {
            if (sayi > 1) {
                return true;
            }
        }
        return false;
    }
    private static String generateRandomWord(ArrayList<Character> harfler) {
        Collections.shuffle(harfler); 
        StringBuilder randomKelime = new StringBuilder();

        for (char harf : harfler) {
            randomKelime.append(harf); 
        }
        return randomKelime.toString();
    }
}
