package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
*/


public class Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private int color;//напишите тут ваш код
    public Circle (int nX, int nY, int nR){
        this.centerX = nX;
        this.centerY = nY;
        this.radius = nR;
    }
    public Circle (int nX, int nY, int nR, int nW){
        this.centerX = nX;
        this.centerY = nY;
        this.radius = nR;
        this.width = nW;
    }
    public Circle (int nX, int nY, int nR, int nW, int nC){
        this.centerX = nX;
        this.centerY = nY;
        this.radius = nR;
        this.width = nW;
        this.color = nC;
    }


    public static void main(String[] args) {

    }
}
