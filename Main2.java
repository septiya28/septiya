package septia;
import  java.util.*;
public class Main2 {
    public static void main(String[] args) {
        String lanjut = "Y";
        while(lanjut.equals("Y")){
            Scanner input = new Scanner(System.in);
            
            System.out.println("|===========================|");
            System.out.println("|        INPUT DATA         |");
            System.out.println("|===========================|");
            System.out.println("  ");
            
            System.out.print("UNIVERSITAS  : "); septia.DataMhs2.univ = input.nextLine();
            System.out.print("NIM          : "); septia.DataMhs2.NIM = input.nextLine();
            System.out.print("NAMA         : "); septia.DataMhs2.Nama = input.nextLine();
            System.out.print("ALAMAT       : "); septia.DataMhs2.Alamat = input.nextLine();
            System.out.println("DAFTAR KODE JURUSAN :");
            System.out.println(" MATEMATIKA          [61]");
            System.out.println(" BIOLOGI             [62]");
            System.out.println(" KIMIA               [63]");
            System.out.println(" FISIKA              [64]");
            System.out.println(" TEKNIK INFORMATIKA  [65]");
            System.out.println(" SISTEM INFORMASI    [66]");
            System.out.print("KODE JURUSAN : "); septia.DataMhs2.Jurusan = input.nextLine();
            System.out.println("  ");
            
            System.out.println("|===========================|");
            System.out.println("|       DATA MAHASISWA      |");
            System.out.println("|===========================|");
            System.out.println("UNIVERSITAS : " + septia.DataMhs2.getUniv());
            System.out.println("NIM         : " + septia.DataUniv2.getNIM());
            System.out.println("NAMA        : " + septia.DataUniv2.getNama());
            System.out.println("ALAMAT      : " + septia.DataMhs2.getAlamat());
            switch (septia.DataMhs2.getJurusan()) {
                case "61":
                    System.out.println("JURUSAN     : MATEMATIKA");
                    break;
                case "62":
                    System.out.println("JURUSAN     : BIOLOGI");
                    break;
                case "63":
                    System.out.println("JURUSAN     : KIMIA");
                    break;
                case "64":
                    System.out.println("JURUSAN     : FISIKA");
                    break;
                case "65":
                    System.out.println("JURUSAN     : TEKNIK INFORMATIKA");
                    break;
                case "66":
                    System.out.println("JURUSAN     : SISTEM INFORMASI");
                    break;
                default :
                    System.out.println("KODE JURUSAN TIDAK VALID");
            }
            System.out.println("  ");
            
            System.out.println("APAKAH ANDA INGIN MEMASUKKAN DATA LAGI ?");
            System.out.println("1. IYA   [Y] \n2. TIDAK [T]");
            System.out.print("PILIHAN : ");
            lanjut = input.nextLine();
        }
        System.out.println("|===========================|");
        System.out.println("|------  THANK YOU :) ------|");
        System.out.println("|===========================|");
        
    }
}
