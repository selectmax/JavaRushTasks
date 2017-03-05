package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize (int nTop, int nLeft, int nWidth, int nHeight){
        this.top = nTop;
        this.left = nLeft;
        this.width = nWidth;
        this.height = nHeight;
    }

    public void initialize (int nTop, int nLeft){
        this.top = nTop;
        this.left = nLeft;
        this.width = 0;
        this.height = 0;
    }

    public void initialize (int nTop, int nLeft, int nWidth){
        this.top = nTop;
        this.left = nLeft;
        this.width = nWidth;
        this.height = nWidth;
    }

    public void initialize (Rectangle a){
        this.top = a.top;
        this.left = a.left;
        this.width = a.width;
        this.height = a.height;
    }
    public static void main(String[] args) {

    }
}
