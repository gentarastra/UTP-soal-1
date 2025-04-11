package utp.shapes;

public class PrismaSegitigaSamaKaki {
    final double PI = 22.0 / 7.0;
    double alas, kaki, tinggi;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggi = tinggi;
    }

    double luasAlas() {
        return alas * tinggi / 2;
    }

    double keliling() {
        return 2 * kaki + alas;
    }

    public double luasPermukaan() {
        return 2 * luasAlas() + keliling() * tinggi;
    }

    public double volume() {
        return luasAlas() * tinggi;
    }

    public void printInfo() {
        System.out.println("Nama            : Prisma Segitiga Sama Kaki");
        System.out.println("Luas permukaan  : " + luasPermukaan());
        System.out.println("Volume          : " + volume());
    }
}
