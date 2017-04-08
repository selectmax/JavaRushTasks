package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child3 = new Human ("dixy", false, 20);
        Human child2 = new Human ("sonic", true, 20);
        Human child1 = new Human ("pikachu", true, 20);
        Human mother = new Human ("mother", false, 43, child1, child2, child3);
        Human father = new Human("father", true, 40, child1, child2, child3);
        Human baba2 = new Human("Valya", false, 69, father);
        Human baba1 = new Human("Nina", false, 61, mother);
        Human ded1 = new Human("Vasiliy", true, 60, mother);
        Human ded2 = new Human("Kolya", true, 61, father);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human {
        String name;//напишите тут ваш код
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human (String name, boolean sex, int age, Human child){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child);
        }

        Human (String name, boolean sex, int age, Human child, Human child2){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child);
            this.children.add(child2);
        }
        Human (String name, boolean sex, int age, Human child, Human child2, Human child3){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child);
            this.children.add(child2);
            this.children.add(child3);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
