package com.company;

public class Fish {
    private String name;
    private int age;
    private String poroda;
    private String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void speed(){
        System.out.println("Самая скоростная рыба");
    }
    void record(){
        System.out.println("Самый быстрый рекорд - 109км/ч");
    }}
