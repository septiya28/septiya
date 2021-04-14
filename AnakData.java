package septia;
import java.util.*;

public class AnakData extends IndukData{
    Scanner input = new Scanner (System.in);
    int pilihan;
    void data(){
        System.out.println("");
        System.out.println("");  
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                SELAMAT DATANG                 ");
        System.out.println("                  RENTAL VCD                   ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        IndukData judul = new IndukData();
        System.out.println("Judul             : ");
        judul.name= input.nextLine();
                
        IndukData aktor = new  IndukData();
        System.out.println("Aktor             : ");
        aktor.name= input.nextLine();
                
        IndukData sutradara = new IndukData();
        System.out.println("Sutradara         : ");
        sutradara.name= input.nextLine();
                
        IndukData publisher = new  IndukData();
        System.out.println("Publisher         : ");
        publisher.name= input.nextLine();
                
        IndukData kategori = new  IndukData();
        System.out.println("Kategori    :");
        System.out.println("1. Semua umur");
        System.out.println("2. Dewasa");
        System.out.println("3. Remaja");
        System.out.println("4. Anak-anak");
        System.out.println("Masukkan Pilihan  : ");
        
        pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                kategori.name = "semua umur";
                break;
            case 2:
                kategori.name = "Dewasa";
                break;
            case 3:
                kategori.name = "Remaja";
                break;
            case 4:
                kategori.name = "Anak-anak";
                break;
        }
        IndukData stok = new  IndukData();
        System.out.println("Stok              : ");
        stok.stok= input.nextInt();
        input.nextLine();
        System.out.println("");
        judul.Judul();
        aktor.Aktor();
        sutradara.sutradara();
        publisher.publisher();
        kategori.kategori();
        stok.stok();
            }   
    }
        
