package septia;
public class IndukData {
    String name;
    int stok;
    
    void Judul (){
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                DAFTAR FILM                     ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Judul Film      : "+this.name);
    }
    void Aktor () {
        System.out.println("Aktor           : "+this.name);
    }
    void sutradara () {
        System.out.println("Sutradara       : "+this.name);
    }
    void publisher() {
        System.out.println("Publisher       : "+this.name);
    }
    void kategori () {
        System.out.println("Kategori        : "+this.name);
    }
    void stok () {
        System.out.println("Stok            : "+this.stok);
    }
}    