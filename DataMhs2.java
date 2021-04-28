package septia;

public class DataMhs2 extends DataUniv2 {
    static String Alamat;
    static String Jurusan;

    public static String getAlamat() {
        return Alamat;
    }

    public static void setAlamat(String Alamat) {
        DataMhs2.Alamat = Alamat;
    }

    public static String getJurusan() {
        return Jurusan;
    }

    public static void setJurusan(String Jurusan) {
        DataMhs2.Jurusan = Jurusan;
    }
}
