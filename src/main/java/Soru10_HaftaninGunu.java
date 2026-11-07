
import java.util.Scanner;

public class Soru10_HaftaninGunu {
    
    public static void main(String[] args) {
        
       Scanner girdi = new Scanner(System.in);
       
        System.out.print("Haftanın hangi gününü öğrenmek istiyorsanız o günün numarasını giriniz: ");
        int no = girdi.nextInt();
        
        switch (no) {
            case 1:  {
                System.out.println("Pazartesi");
            }
            case 2:  {
                System.out.println("Salı");
            }
            case 3:  {
                System.out.println("Çarşamba");
            }
            case 4: {
                System.out.println("Perşembe");
            }
            case 5:  {
                System.out.println("Cuma");
            }
            case 6:  {
                System.out.println("Cumartesi");
            }
            case 7:  {
                System.out.println("Pazar");
            }
            default: {
                System.out.println("Lütfen geçerli bir sayi giriniz.");
            }
                
        }
    }
    
}
