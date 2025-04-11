package utp.mains;

// Nama: GENTA RASTRA LISTIAWAN
// NIM: 245150707111031
//  _____ ______ _   _ _______         _____             _____ _______ _____             
// / ____|  ____| \ | |__   __|/\     |  __ \     /\    / ____|__   __|  __ \     /\     
// | |  __| |__  |  \| |  | |  /  \    | |__) |   /  \  | (___    | |  | |__) |   /  \    
// | | |_ |  __| | . ` |  | | / /\ \   |  _  /   / /\ \  \___ \   | |  |  _  /   / /\ \   
// | |__| | |____| |\  |  | |/ ____ \  | | \ \  / ____ \ ____) |  | |  | | \ \  / ____ \  
//  \_____|______|_| \_|  |_/_/    \_\ |_|  \_\/_/    \_\_____/   |_|  |_|  \_\/_/    \_\ 
                                                                                      

import java.util.Scanner;
import utp.shapes.*;

public class Main {
    public static void main(String[] args) {
        final String RESET = "\033[0m";  
        final String RED = "\033[31m";    
        final String GREEN = "\033[32m";  
        final String BLUE = "\033[34m";   
        final String CYAN = "\033[36m";   
        final String YELLOW = "\033[33m"; 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(CYAN + "=============================================" + RESET);
        System.out.println(GREEN + "Kalkulator Bangun Ruang" + RESET);
        System.out.println(YELLOW + "GENTA RASTRA LISTIAWAN" + RESET);
        System.out.println(YELLOW + "245150707111031" + RESET);
        System.out.println(CYAN + "=============================================" + RESET);
        
        System.out.println(BLUE + "Prisma Segitiga Sama Kaki" + RESET);
        System.out.println(CYAN + "=============================================" + RESET);
        System.out.print("Isikan alas : ");
        double alas = scanner.nextDouble();
        System.out.print("Isikan kaki : ");
        double kaki = scanner.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggi = scanner.nextDouble();
        
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggi);
        System.out.println(CYAN + "=============================================" + RESET);
        System.out.print(GREEN);
        prisma.printInfo();
        System.out.print(RESET);
        System.out.println(CYAN + "=============================================" + RESET);
        
        System.out.println(BLUE + "Limas Persegi" + RESET);
        System.out.println(CYAN + "=============================================" + RESET);
        System.out.print("Isikan sisi : ");
        double sisi = scanner.nextDouble();
        System.out.print("Isikan tinggi : ");
        tinggi = scanner.nextDouble();
        
        LimasPersegi limas = new LimasPersegi(sisi, tinggi);
        System.out.println(CYAN + "=============================================" + RESET);
        System.out.print(GREEN);
        limas.printInfo();
        System.out.print(RESET);
        System.out.println(CYAN + "=============================================" + RESET);
        
        System.out.println(BLUE + "Tabung" + RESET);
        System.out.println(CYAN + "=============================================" + RESET);
        System.out.print("Isikan radius : ");
        double radius = scanner.nextDouble();
        System.out.print("Isikan tinggi : ");
        tinggi = scanner.nextDouble();
        
        Tabung tabung = new Tabung(radius, tinggi);
        System.out.println(CYAN + "=============================================" + RESET);
        System.out.print(GREEN);
        tabung.printInfo();
        System.out.print(RESET);
        System.out.println(CYAN + "=============================================" + RESET);
        
        scanner.close();
    }
}
