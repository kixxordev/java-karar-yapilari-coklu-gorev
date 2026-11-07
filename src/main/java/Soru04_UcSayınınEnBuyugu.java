
import java.util.Scanner;

public class Soru04_UcSayınınEnBuyugu {

    public static void main(String[] args) {
     
    Scanner girdi = new Scanner(System.in);
    
    System.out.println("Merhaba. Simdi senden 3 tane sayi isteyecegim, bu 3 sayidan hangisinin daha buyuk oldugunu sana soyleyecegim.");
        
        System.out.print("Lutfen ilk sayiyi gir: ");
        int sayi1 = girdi.nextInt();
        
        System.out.print("Tamamdir, ilk sayiyi aldim. 2. sayiyi da gir: ");
        int sayi2 = girdi.nextInt();
 
        System.out.print("Tamamdir, 2. sayiyi da aldim. 3. sayiyi da gir: ");
        int sayi3 = girdi.nextInt();
        
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            
            System.out.println("Ilk girdigin sayi olan " + sayi1 + " sayisi diger iki sayidan buyuktur.");
            
        } else {
            
            if (sayi2 > sayi1 && sayi2 > sayi3) {
                
                System.out.println("2. girdigin sayi olan " + sayi2 + " sayisi diger iki sayidan buyuktur.");
                
            } else {
                
                if (sayi3 > sayi1 && sayi3 > sayi2) {
                    
                    System.out.println("3. girdigin sayi olan " + sayi3 + " sayisi diger iki sayidan buyuktur.");
                    
                } else {
                    if (sayi1 == sayi2 && sayi2 == sayi3) {
                        
                        System.out.println("Girdigin sayilarin hepsi birbirine esittir.");
                        
                    } else {
                        if (sayi1 == sayi2 && sayi1 > sayi3) {
                            
                            System.out.println("Girdigin sayilarin ilk ikisi birbirine esittir ve diger sayıdan buyuktur.");
                            
                        } else {
                            if (sayi1 == sayi3 && sayi1 > sayi2) {
                                
                                System.out.println("Girdigin sayilarin ikisi (1. ve 3.)  birbirine esittir ve diger sayıdan buyuktur.");
                                
                            } else {
                                
                                System.out.println("Girdigin sayilarin ikisi (2. ve 3.)  birbirine esittir ve diger sayıdan buyuktur.");
                                
                            }
                        }
                    }
                    
                }
            }
        }
   
    }
    
    
}
