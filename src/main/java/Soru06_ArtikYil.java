
import java.util.Scanner;

public class Soru06_ArtikYil {
    
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("Lutfen artik yil olup olmadigini ogrenmek istedigin yili gir: ");
        int yil = girdi.nextInt();
        
        if (yil%4 == 0) {
            
            System.out.println("Girdigin yil bir artik yildir.");
            
        } else {
            
            System.out.println("Girdigin yil bir artik yil degildir.");
            
        }
        girdi.close();
    }
}
