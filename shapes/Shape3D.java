package utp.shapes;

public abstract class Shape3D {
    protected double tinggi;
    
    public Shape3D(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public abstract double getLuasPermukaan();
    public abstract double getVolume();
    public abstract String getNama();
    
    public void printInfo() {
        System.out.println("Nama : " + getNama());
        System.out.println("Luas permukaan : " + getLuasPermukaan());
        System.out.println("Volume : " + getVolume());
    }
}