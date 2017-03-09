package com.javarush.task.task06.task0608;

/* 
Статические методы для кошек
*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
      return (Cat.catCount);  //напишите тут ваш код
    }

    public static void setCatCount(int catCount) {
       Cat.catCount = catCount; //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
