package com.company;
public class Sobaka {
    private String name;
    private int age;
    private String poroda;
    private String color;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getPoroda(){
        return poroda;
    }
    public void setPoroda(String breed){
        this.poroda = poroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colour) {
        this.color = color;


    }
    void barks(){
        System.out.println("dog barks");
    }
    void run(){
        System.out.println("dog is running");
    }
}



