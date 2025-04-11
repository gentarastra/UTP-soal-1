package utp.shapes;

public class Tabung extends Shape3D {
    private double radius;
    private final double PI = 22.0 / 7.0;
    
    public Tabung(double radius, double tinggi) {
        super(tinggi);
        this.radius = radius;
    }
    
    public double getLuasAlas() {
        return radius * radius * PI;
    }
    
    public double getKeliling() {
        return 2 * radius * PI;
    }
    
    @Override
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * tinggi;
    }
    
    @Override
    public double getVolume() {
        return getLuasAlas() * tinggi;
    }
    
    @Override
    public String getNama() {
        return "Tabung";
    }
}