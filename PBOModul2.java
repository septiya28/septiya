package septia;
import  java.util.*;

public class PBOModul2 {
   
    
    public static void main(String[] args) {
        AnakData  data = new AnakData();
        Scanner input = new Scanner(System.in);
        int pilih = 2;
        
        while (pilih == 2) {            
        data.data();
        System.out.println("\nMengulang lagi ? ( 2 untuk Ya dan 0 untuk Tidak )");
        System.out.print("Masukkan pilihan : ");
        pilih = input.nextInt();
            input.nextLine();
            if (pilih != 2) {
            pilih = 0;
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("    Terimakasih Telah Mengunjungi Rental VCD SI     ");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }    
    }
    }
}