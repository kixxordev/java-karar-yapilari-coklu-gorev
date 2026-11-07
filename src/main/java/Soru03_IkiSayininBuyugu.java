
import java.util.Scanner;

public class Soru03_IkiSayininBuyugu {
    
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.println("Merhaba. Simdi senden 2 tane sayi isteyecegim, bu 2 sayidan hangisinin daha buyuk oldugunu sana soyleyecegim.");
        
        System.out.print("Lutfen ilk sayiyi gir: ");
        int sayi1 = girdi.nextInt();
        
        System.out.print("Tamamdir, ilk sayiyi aldim. 2. sayiyi da gir: ");
        int sayi2 = girdi.nextInt();
        
        if (sayi1 > sayi2) {
            
            System.out.println("Ilk girdigin sayi olan " + sayi1 + ", 2. girdigin sayi olan " + sayi2 + "'dan/den daha buyuktur.");
            
        } else {
            
            if (sayi2 > sayi1) {
                
               System.out.println("2. girdigin sayi olan " + sayi2 + ", ilk girdigin sayi olan " + sayi1 + "'dan/den daha buyuktur."); 
            
            } else {
                
                System.out.println("Girdigin iki sayi birbirine esit.");
            }
            
        }
          girdi.close();
    }
}
    

