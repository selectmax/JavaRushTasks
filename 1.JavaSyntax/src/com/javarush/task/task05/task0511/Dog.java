package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialize(String newName){
        this.name = newName;
        this.height = 100;
        this.color = "Black";
    }
    public void initialize (String newName, int newHeight){
        this.name = newName;
        this.height = newHeight;
        this.color = "Black";
    }
    public void initialize (String newName, int newHeight, String newColor){
        this.name = newName;
        this.height = newHeight;
        this.color = newColor;
    }



    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
