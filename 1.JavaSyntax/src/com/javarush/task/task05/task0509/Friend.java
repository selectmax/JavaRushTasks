package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    private String name = null;
    private int age;
    private char sex;

    public void initialize (String newName) {
        this.name = newName;
    }
    public void initialize (String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }
    public void initialize (String newName, int newAge, char newSex){
        this.name = newName;
        this.age = newAge;
        this.sex = newSex;
    }


    public static void main(String[] args) {

    }
}
