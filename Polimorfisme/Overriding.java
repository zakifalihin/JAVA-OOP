package Polimorfisme;

class Hewan {

    void bersuara() {
        System.out.println("Hewan Mengeluarkan Suara ");
    }
}

class Kucing extends Hewan {

    @Override
    void bersuara() {
        System.out.println("Meongg....");
    }
}

class Anjing extends Hewan {

    @Override
    void bersuara() {
        System.out.println("Guk... Gukk..");
    }
}

public class Overriding {

    public static void main() {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.bersuara();
        hewan2.bersuara();
    }
}
