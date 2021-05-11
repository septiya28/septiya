package septiya;

public class OprasiBilangan {
    
    protected double a;
    protected double b;
    protected double c;
    protected double d;
    
    protected void setA(double a) {
        this.a = a < 0 ? 1 : a;
    }
    protected void setB(double b) {
        this.b = b < 0 ? 1 : b;
    }
    protected void setC(double c){
        this.c = c < 0 ? 1 : c;
    }
    protected void setD(double d){
        this.d = d < 0 ? 1 : d;
    }
    public double hitung() {
        return 0;
    }
    
}