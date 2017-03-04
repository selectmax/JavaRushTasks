package com.javarush.task.task04.task0406;

/* 
Реализовать метод setName
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
