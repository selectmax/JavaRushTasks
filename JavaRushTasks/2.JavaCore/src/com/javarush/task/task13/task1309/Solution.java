package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Movable{
       public Double speed();
    }

    interface Flyable extends Movable {
        public Double speed(Flyable who);
    }

}