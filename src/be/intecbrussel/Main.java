package be.intecbrussel;

public class Main {

    public static void main(String[] args) {
        Bord een = new RondBord("karton", "groen", 30);
        Bord twee = new VierkantBord("porcelijn", "wit", 20);
// Bord bord = new Bord("karton", "blauw"); <-- Verboden!
        System.out.printf("een = %-15s %5.2f cm²%n", een, een.oppervlakte());
        System.out.printf("twee = %-15s %5.2f cm²%n", twee, twee.oppervlakte());
    }
}
