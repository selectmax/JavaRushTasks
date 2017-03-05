package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private int color;

    public void initialize (int newX, int newY, int newR){
        this.centerX = newX;
        this.centerY = newY;
        this.radius = newR;
    }
    public void initialize (int newX, int newY, int newR, int newWidth){
        this.centerX = newX;
        this.centerY = newY;
        this.radius = newR;
        this.width = newWidth;
    }
    public void initialize (int newX, int newY, int newR, int newWidth, int newColor){
        this.centerX = newX;
        this.centerY = newY;
        this.radius = newR;
        this.width = newWidth;
        this.color = newColor;
    }

    public static void main(String[] args) {

    }
}
