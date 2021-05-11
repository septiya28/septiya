package septiya;

public class Main {

    public static void main(String[] args) {
        
        OprasiBilangan jumlah = new Penjumlahan();
        jumlah.setA(10.5);
        jumlah.setB(0.5);
        System.out.println("Hasil 10.5 + 0.5 = " + jumlah.hitung());
        
        OprasiBilangan kurang = new Pengurangan();
        kurang.setA(10.5);
        kurang.setB(0.5);
        System.out.println("Hasil 10.5 - 0.5 = " + kurang.hitung());
        
        OprasiBilangan kali = new Perkalian();
        kali.setA(1.5);
        kali.setB(0.5);
        System.out.println("Hasil 10.5 * 0.5 = " + kali.hitung());
        
        OprasiBilangan Bagi = new Pembagian();
        Bagi.setA(10.5);
        Bagi.setB(0.5);
        System.out.println("Hasil 10.5 / 0.5 = " + Bagi.hitung());
        
    }
    
}