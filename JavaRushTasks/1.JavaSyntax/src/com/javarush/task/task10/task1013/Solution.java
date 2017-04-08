package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private int age;
        private int height;
        private Human mother;
        private Human father;
        public Human(){
            this.name = "Unnamed";
        }
        public Human(String name){
            this.name = name;
        }
        public Human(String name, String lastName){
            this.lastName = lastName;
            this.name = name;
        }
        public Human(String name, String lastName, int age){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
        public Human(String name, int age){
        this.name = name;
        this.age = age;
        }
        public Human(String name, String lastName, int age, int height){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
        }
        public Human(String name, String lastName, int age, int height, Human mother){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
            this.mother = mother;
        }
        public Human(String name, String lastName, int age, int height, Human mother, Human father){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
            this.mother = mother;
            this.father = father;
        }
        public Human(String name, String lastName, Human mother){
            this.name = name;
            this.lastName = lastName;
            this.mother = mother;
        }
        public Human(String name, String lastName, Human mother, Human father){
            this.name = name;
            this.lastName = lastName;
            this.mother = mother;
            this.father = father;
        }



    }
}
