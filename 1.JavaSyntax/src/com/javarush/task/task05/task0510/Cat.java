package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name = null;//напишите тут ваш код
    private int weight = 1;
    private int age = 1;
    private String address = null;
    private String color = null;

    public void initialize (String newName){
    this.name = newName;
    this.weight = 1;
    this.age = 1;
    this.color = "Black";
    }
    public void initialize (String newName, int newWeight, int newAge){
        this.name = newName;
        this.weight = newWeight;
        this.age = newAge;
        this.color = "Black";
    }
    public void initialize (String newName, int newAge){
        this.name = newName;
        this.age = newAge;
        this.color = "Black";
        this.weight = 1;
    }
    public void initialize (int newWeight, String newColor){
        this.weight = newWeight;
        this.color = newColor;
    }
    public void initialize (int newWeight, String newColor, String newAddress){
        this.weight = newWeight;
        this.color = newColor;
        this.address = newAddress;
    }

    public static void main(String[] args) {

    }
}
