package Encapsulasi;

class Person {
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {  
            this.age = age;
        } else {
            System.out.println("Umur harus lebih dari 0!");
        }
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Nama: " + name + ", Umur: " + age);
    }
}

