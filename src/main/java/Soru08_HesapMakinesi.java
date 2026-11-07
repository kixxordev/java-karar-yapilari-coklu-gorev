
import java.util.Scanner;

public class Soru08_HesapMakinesi {
    
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.println("Merhaba. Hesap makinesine hoşgeldin. Hangi işlemi yapmak istiyorsan o işlemin operatörünü gir.");
        System.out.print("(+) Toplama, (-) Cikarma, (*) Carpma (/) Bolme: ");
        String islem = girdi.next();
        
        int sayi1;
        int sayi2;
        int sonuc;
        
        switch (islem) {
            case "+": 
                System.out.print("Tamamdir. Toplama islemini yapabilmem icin bana ilk sayiyi soyler misin: ");
                sayi1 = girdi.nextInt();
                
                System.out.print("Ilk sayiyi kaydettim, 2. sayiyi da soyler misin: ");
                sayi2 = girdi.nextInt();
                
                sonuc = sayi1 + sayi2;
                System.out.println("Yaptigin toplama isleminin sonucu: " + sonuc);
                
                break;
            
            case "-": 
                System.out.print("Tamamdir. Cikarma islemini yapabilmem icin bana cikartilan sayiyi soyler misin: ");
                sayi1 = girdi.nextInt();
                
                System.out.print("Cikartilan sayiyi kaydettim, cikan sayiyi da soyler misin: ");
                sayi2 = girdi.nextInt();
                
                sonuc = sayi1 - sayi2;
                System.out.println("Yaptigin cikarma isleminin sonucu: " + sonuc);
                
                break;
                
            case "*": 
                System.out.print("Tamamdir. Carpma islemini yapabilmem icin bana ilk sayiyi soyler misin: ");
                sayi1 = girdi.nextInt();
                
                System.out.print("İlk sayiyi kaydettim, 2. sayiyi da soyler misin: ");
                sayi2 = girdi.nextInt();
                
                sonuc = sayi1 * sayi2;
                System.out.println("Yaptigin carpma isleminin sonucu: " + sonuc);
                
                break;
                
            case "/": 
                System.out.print("Tamamdir. Bolme islemini yapabilmem icin bana bolunen sayiyi soyler misin: ");
                sayi1 = girdi.nextInt();
                
                System.out.print("Bolunen sayiyi kaydettim, bolen sayiyi da soyler misin: ");
                sayi2 = girdi.nextInt();

                if (sayi2 != 0) {
                    
                    sonuc = sayi1 / sayi2;
                    System.out.println("Yaptigin bolme isleminin sonucu: " + sonuc); 
                    
                } else {
                    
                    System.out.println("Bu islem yapilamaz.");
                }

                break;
                
            default:
                System.out.println("Lutfen gecerli bir operator giriniz.");
        }
    
    }
}
