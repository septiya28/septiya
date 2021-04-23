
package septia;
import java.util.*;
    
    public class Kelinci extends MahklukHidup{
    Scanner input = new Scanner (System.in);
    int pilihan;
    void data(){
        System.out.println("");
        MahklukHidup ucil1 = new MahklukHidup();
        System.out.println("Nama Kelinci itu            : ");
        ucil1.name= input.nextLine();
        System.out.println("");
        MahklukHidup ucil2 = new MahklukHidup();
        System.out.println("Warna Kelinci itu           : ");
        ucil2.warna= input.nextLine();
        
        ucil1.KelinciNama();
        ucil2.KelinciWarna();
        
    }
}
