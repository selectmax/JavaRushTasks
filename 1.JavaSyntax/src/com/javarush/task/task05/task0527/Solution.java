package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse minniMouse = new Mouse ("Minny", 13, 4);
        Cat tomCat = new Cat ("Tom", 3, 23);
        Cat blackCat = new Cat ("Black", 3, 3);
        Dog pitbullDog = new Dog ("Billy", 2, 3);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        String name;
        int age;
        int tail;

        public Dog(String name, int age, int tail) {
            this.name = name;
            this.age = age;
            this.tail = tail;
        }
    }
    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    //напишите тут ваш код
}
