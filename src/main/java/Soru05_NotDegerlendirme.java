/*

90–100	AA
80–89	BA
70–79	BB
60–69	CB
50–59	CC
0–49	FF

*/

import java.util.Scanner;

public class Soru05_NotDegerlendirme {
    
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.print("Lutfen notunu gir: ");
        Double not = girdi.nextDouble();
        
        if (not >= 90 && not <= 100 ) { 
            
            System.out.println("Not degerlendirmen: AA");
            
        } else {
            
            if (not >= 80 && not < 90) {
                
                System.out.println("Not degerlendirmen: BA");
               
            } else {
                
                if (not >= 70 && not < 80) {
                    
                    System.out.println("Not degerlendirmen: BB");
                    
                } else {
                    
                    if (not >= 60 && not < 70) {
                        
                        System.out.println("Not degerlendirmen: CB");
                        
                    } else {
                        if (not >= 50 && not < 60) {
                            
                            System.out.println("Not degerlendirmen: CC");
                            
                        } else {
                            if (not < 50 && not >= 0) {
                                
                                System.out.println("Not degerlendirmen: FF");
                                
                            } else {
                                
                                System.out.println("Lutfen gecerli bir not giriniz.");
                                
                            }
                        }
                    }
                }
                
            }
    
            
        }
           
        girdi.close();
    }
}
