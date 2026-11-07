
import java.util.Scanner;

public class Soru02_PozitifNegatifSifir {
    
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("Lutfen bir sayi girin: ");
        int sayi = girdi.nextInt();
        
        if (sayi > 0) {
            
            System.out.println("Girdigin sayi olan " + sayi + " pozitif bir sayidir.");
            
        } else {
            
            if (sayi == 0) {
            
                System.out.println("Girdigin sayi sifirdir.");
                
            } else {
                
                System.out.println("Girdigin sayi olan " + sayi + " negatif bir sayidir.");
            }
            
            
        } 
        
        girdi.close();
    }
    
}      
       
    