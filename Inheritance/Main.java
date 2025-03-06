package Inheritance;

// File: Hewan.java (Semua dalam satu file)

class Hewan {
    String nama;
    
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara...");
    }
}


class Ayam extends Hewan {
    public Ayam(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berkokok: Kukuruyuk!");
    }
}


class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}


class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " menggonggong: Woof!");
    }
}


public class Main {
    public static void main(String[] args) {
        Hewan ayam = new Ayam("Ayam Jago");
        Hewan kucing = new Kucing("Si Putih");
        Hewan anjing = new Anjing("Buddy");

        ayam.bersuara();
        kucing.bersuara();
        anjing.bersuara();
    }
}
