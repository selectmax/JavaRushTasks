package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
   private int top;
   private int left;
   private int width;
   private int height;

   public Rectangle (int top, int left, int width, int height) {
       this.top = top;
       this.left = left;
       this.width = width;
       this.height = height;
   }
    public Rectangle (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public Rectangle (Rectangle a) {
        this.top = a.top;
        this.left = a.left;
        this.width = a.width;
        this.height = a.height;
    }

    public static void main(String[] args) {

    }
}
