
import java.util.Scanner;

public class Soru09_UcgenTuru {
    
    public static void main(String[] args) {
       
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("Ucgenin ilk kenari girin: ");
        int kenar1 = girdi.nextInt();

        System.out.print("Ucgenin 2. kenarini girin: ");
        int kenar2 = girdi.nextInt();
        
        System.out.print("Ucgenin 3. kenarini girin: ");
        int kenar3 = girdi.nextInt();
        
        
        boolean kontrol1 = kenar3 + kenar2 > kenar1;
        boolean kontrol2 = kenar1 + kenar3 > kenar2;
        boolean kontrol3 = kenar1 + kenar2 > kenar3;
        
        
        if (kontrol1 == true && kontrol2 == true && kontrol3 == true && kenar1 != 0 && kenar2 != 0 && kenar3 != 0) { //Üçgen olup olmadığını kontrol etme
            
            System.out.println("Girdiginiz kenarla bir ucgen olusturulabildigi dogrulandi. İsleminiz devam ediyor.");
            
            if (kenar1 == kenar2 && kenar2 == kenar3) {
            
            System.out.println("Kenarlarini girdigin ucgen eskenar ucgendir.");
 
                } else {
                    
                if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                    
                        System.out.println("Kenarlarini girdigin ucgen ikizkenar ucgendir.");
                    
                        } else {
                     System.out.println("Kenarlarini girdigin ucgen cesitkenar ucgendir.");
                    }

            }
        } else {
            
            System.out.println("Girdiginiz kenarlarla bir ucgen olusturulamiyor. Lutfen baska degerler girin.");
            
        }
  
    }
}
