package Encapsulasi;

public class Main {

    public static void main(String[] args) {
        // Membuat objek Person
        Person person1 = new Person("Alice", 25);

        // Menampilkan data awal
        person1.displayInfo();

        // Mengubah data dengan setter
        person1.setName("Bob");
        person1.setAge(20);

        // Menampilkan data setelah diubah
        person1.displayInfo();
    }
}
