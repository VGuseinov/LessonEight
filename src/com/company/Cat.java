package com.company;

public class Cat extends Animal {
    public boolean isBald;

    public Cat() {
        super(12, "yellow"); // вызов родительского класса
        this.isBald = true; // установка лысого кота по умолчанию
        System.out.println("Cat was created");
    }

    // переопределение метода printInfo из класса Animal
    // изменение кода родительского метода

    @Override // писать перед переопределяемым методом
    public void printInfo() {
        if (this.isBald) {
            System.out.print("Bald ");
        } else {
            System.out.print("is not Bald, ");
        }

        // super - ссылка на родительский экземпляр класса
        super.printInfo();
    }


}
