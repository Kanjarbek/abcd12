package com.company;

public class Main {
    public static void main(String[] args) {
        Sobaka sobaka = new Sobaka();
        sobaka.setName("Морти");
        sobaka.setAge(4);
        sobaka.setPoroda("Немецкая овчарка");
        sobaka.setColor("black");


        System.out.println("name: " + sobaka.getName());
        System.out.println("age: " + sobaka.getAge());
        System.out.println("breed: " + sobaka.getPoroda());
        System.out.println("colour: " + sobaka.getColor());
        sobaka.barks();
        sobaka.run();
        System.out.println();

        Fish fish = new Fish();
        fish.setName("Пират");
        fish.setAge(3);
        fish.setColor("Blue");
        fish.setPoroda("Парусник");

        System.out.println("name: " + fish.getName());
        System.out.println("age: " + fish.getAge());
        System.out.println("color: " + fish.getColor());
        System.out.println("Порода: " + fish.getPoroda());
        fish.speed();
        fish.record();
        System.out.println();

        Koshka koshka = new Koshka();
        koshka.setName("Garfield");
        koshka.setAge(2);
        koshka.setColor("Yellow");
        koshka.setPoroda("Экзот");
        System.out.println("name: " + koshka.getName());
        System.out.println("age: " + koshka.getAge());
        System.out.println("Breed: " + koshka.getPoroda());
        System.out.println("Colour: " + koshka.getColor());
        koshka.sleep();
        koshka.taste();
        System.out.println();

        Popugai popugai = new Popugai();
        popugai.setName("Gagi");
        popugai.setAge(1);
        popugai.setPoroda("Экзотическая");
        popugai.setColor("blue and yellow");

        System.out.println("name: " + popugai.getName());
        System.out.println("age: " + popugai.getAge());
        System.out.println("Breed: " + popugai.getPoroda());
        System.out.println("Colour: " +popugai.getColor());
        popugai.copy();
        popugai.fly();
    }
}
