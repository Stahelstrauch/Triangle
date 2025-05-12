package models;


public class Triangle {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    /**
     * tagastab aluse
     * @return alus
     */
    public double getA() {
        return a;
    }

    /**
     * tagastab kõrguse
     * @return kõrgus
     */
    public double getH() {
        return h;
    }

    /**
     * saab muuta alust
     * @param a uus alus
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * saab muuta kõrgust
     * @param h uus kõrgus
     */
    public void setH(double h) {
        this.h = h;
    }

    /**
     * arvutab kolmnurga pindala kasutades alust ja kõrgust
     * @return tagastab pindala
     */
    public double calculateArea() {
        return (a * h) / 2;
    }

    /**
     * Arvutab kolmnurga külje (võrdkülgne kolmnurk), kasutades pütagorase teoreemi
     * @return tagastab külje pikkuse
     */
    public double calculateSide() {
        return Math.sqrt(Math.pow(a/2, 2) + Math.pow(h, 2));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }
}

