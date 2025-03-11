package Polimorfisme;

class kalkulator {

    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}

public class Overloading {

    public static void main(String[] args) {
        kalkulator k = new kalkulator();

        System.out.println("Nilai int 1    :" + k.tambah(5, 10));
        System.out.println("Nilai int 2    :" + k.tambah(2, 20, 4));
        System.out.println("Nilai double 3 :" + k.tambah(5.5, 5.5));
    }
}
