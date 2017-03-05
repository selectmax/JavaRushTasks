package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
   private String name;
   private int weight;
   private int age;
   private String color;
   private String address;

   public Cat (String newName){
       this.name = newName;
       this.weight = 1;
       this.age = 1;
      // this.address = null;
       this.color = "Black";
   }
    public Cat (String newName, int newWeight, int newAge){
        this.name = newName;
        this.weight = newWeight;
        this.age = newAge;
        this.address = null;
        this.color = "Black";
    }
    public Cat (String newName, int newAge){
        this.name = newName;
        this.weight = 1;
        this.age = newAge;
        //this.address = null;
        this.color = "Black";
    }
    public Cat (int newWeight, String newColor){
        this.name = null;
        this.weight = newWeight;
        this.age = 1;
        this.address = null;
        this.color = newColor;
    }
    public Cat (int newWeight, String newColor, String newAddress){
        this.name = null;
        this.weight = newWeight;
        this.age = 1;
        this.address = newAddress;
        this.color = newColor;
    }

   //напишите тут ваш код

    public static void main(String[] args) {

    }
}
