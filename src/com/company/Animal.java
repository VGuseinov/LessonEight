package com.company;

public class Animal {

    public String color;
    private int age;
    private int height;

    // для констуктора @Override не пишется.
    public Animal() {
        System.out.println("Animal was created");
    }

    public Animal(int age) {
        this.setAge(age);
    }

    // this()  вызов конструктора должен быть на первой строке в конструкторе
    public Animal(int age, String color) {
        this(age); // this() может использоваться как метод
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("Wrong age");
            return;
        }

        // this - ссылка на текущий экземпляр объекта класса
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void printInfo() {
        System.out.println(this.color + ", " + this.age);
    }
}
