package com.javarush.task.task04.task0407;

/* 
Кошки во Вселенной
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Cats count is " + Cat.count);
        Cat cat1 = new Cat();
        Cat.count += 1;//напишите тут ваш код
        System.out.println("Cats count is " + Cat.count);
        Cat cat2 = new Cat();
        Cat.count += 1;//напишите тут ваш код

        System.out.println("Cats count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}