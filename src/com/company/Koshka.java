package com.company;

public class Koshka {

    private  String name;
    private  String color;
    private  String poroda;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void taste (){
        System.out.println("Кошки не чуствуют сладкого вкуса");
    }
    void sleep(){
        System.out.println("Кошки спят около 70% своей жизни");
    }
}
