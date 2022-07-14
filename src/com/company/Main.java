package com.company;

public class Main {

    public static void main(String[] args) {
        // Animal () - вызов метода, который называется конструктор
        Animal animal = new Animal();
        animal.setAge(56);
        animal.color = "Gray";
        animal.printInfo();

        Cat kitty = new Cat();
        kitty.color = "Blue";
        kitty.setAge(25);
        kitty.printInfo();

        Animal a = new Animal(45);
        a.color = "Violet";
        a.printInfo();

        Animal b = new Animal(41, "Red");
        b.printInfo();
    }
}
