package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public abstract class Dog implements Move, Eat {
    }

    public abstract class Duck implements Move, Eat, Fly {
    }

    public abstract class Car implements Move {
    }

    public abstract class Airplane implements Move, Fly {
    }
}
