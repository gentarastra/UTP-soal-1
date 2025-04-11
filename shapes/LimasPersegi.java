package utp.shapes;

public class LimasPersegi extends Shape3D {
    private double sisi;
    private final double ts;
    
    public LimasPersegi(double sisi, double tinggi) {
        super(tinggi);
        this.sisi = sisi;
        this.ts = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(sisi / 2, 2));
    }
    
    public double getLuasSisiTegak() {
        return ts * sisi / 2;
    }
    
    public double getLuasAlas() {
        return sisi * sisi;
    }
    
    @Override
    public double getLuasPermukaan() {
        return 4 * getLuasSisiTegak() + getLuasAlas();
    }
    
    @Override
    public double getVolume() {
        return getLuasAlas() * tinggi / 3;
    }
    
    @Override
    public String getNama() {
        return "Limas Persegi";
    }
}