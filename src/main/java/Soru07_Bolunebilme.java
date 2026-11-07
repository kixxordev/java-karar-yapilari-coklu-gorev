
import java.util.Scanner;

public class Soru07_Bolunebilme {
    
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("Lutfen bir sayi girin: ");
        int sayi = girdi.nextInt();
        
        boolean uc = sayi%3 == 0;
        boolean bes = sayi%5 == 0;
        boolean onbes = sayi%15 == 0;
        
        if (onbes == true) {
            
            System.out.println("Girdigin sayi hem 3'e hem de 5'e tam bolunur.");
            
        } else {
            
            if (uc == true) {
                
                System.out.println("Girdigin sayi 3'e tam bolunur ama 5'e tam bolunmez.");
    
                }
            
            if (bes == true) {
                System.out.println("Girdigin sayi 5'e tam bolunur ama 3'e tam bolunmez.");
            }
                
            if (uc == false && bes == false) {
                
                System.out.println("Girdigin sayi 3'e de 5'e de tam bolunmez.");
                
                }
 
                }
        girdi.close();
            }
            
        }
        
        
        
        
        
    

