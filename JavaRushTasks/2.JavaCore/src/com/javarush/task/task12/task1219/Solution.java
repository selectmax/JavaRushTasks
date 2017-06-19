package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public abstract class Human implements Run, Swim {

    }

    public abstract class Duck implements Swim, Fly, Run {

    }

    public abstract class Penguin implements Swim, Run {

    }

    public abstract class Airplane implements Fly, Run {

    }
}
