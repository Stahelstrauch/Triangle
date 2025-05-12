import models.Triangle;
import java.util.Random;
import java.util.Scanner;

public class MainTriangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a = askA(true);
        double h = randomH();

        Triangle triangle = new Triangle(a, h);
        double area = triangle.calculateArea();
        double side = triangle.calculateSide();

        System.out.printf("Võrdhaarse kolmnurga, mille alus on %s ja kõrgus on %.3f, pindala on %s ja ühe haara pikkus on %s.", Double.toString(a), h, Double.toString(area), Double.toString(side));
    }

    /**
     * Küsib kasutajalt murdarvu, kontrollib, et see on ikka murdarv
     * @param bool Kui murdarv ja väiksem kui 10, siis tagastab arvu
     * @return
     */
    private static double askA(boolean bool) {
        if (bool) {
            double a;
            while (true) {
                System.out.print("Sisesta murdarv, mis on väiksem kui 10: ");
                if (scanner.hasNextDouble()) {
                    a = scanner.nextDouble();
                    if (a < 10) {
                        // System.out.println("Sa sisestasid: " + a);
                        if (a % 1 != 0) {
                            //System.out.println("See on tõesti murdarv: " + a);
                            return a;
                        } else {
                            System.out.println("See on täisarv, mitte murdarv. Proovi uuesti.");
                        }
                    } else {
                        System.out.println("Sisestatud arv ei sobi. Proovi uuesti.");
                    }
                } else {
                    System.out.println("See ei olnud murdarv. Proovi uuesti.");
                    scanner.next();
                }
            }
        }
        return 0;
    }

    /**
     * Genereerib random arvu (kuni 10000) ja jagab selle 1000-ga, et saada 3 komakohta.
     * @return tagastab murdarvu, millel on 3 komakohta
     */
    private static double randomH() {
        Random rand = new Random();
        int raw = rand.nextInt(10000);
        double h = raw / 1000.0;
        //System.out.println("Juhuslikult valitud kõrgus : " + h);
        return h;
    }
}
