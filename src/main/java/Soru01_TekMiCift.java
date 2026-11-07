
import java.util.Scanner;

public class Soru01_TekMiCift {
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("Lutfen bir sayi girin: ");
        int sayi = girdi.nextInt();
        
        if (sayi%2 == 0) {
            
            System.out.println("Girdigin sayi cifttir.");
            
        } else {
            
            System.out.println("Girdigin sayi tektir.");
            
        } 
        
        girdi.close();
    }
    
}