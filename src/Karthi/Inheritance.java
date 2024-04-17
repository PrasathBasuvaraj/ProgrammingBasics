package Karthi;

class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");

        animal.sound();
        dog.sound();

        System.out.println("Animal name: " + animal.name);
        System.out.println("Dog name: " + dog.name);
    }
}
