package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
      Human ded1 = new Human ("Alexey", true, 61);
      Human ded2 = new Human ("Max", true, 59);
      Human baba1 = new Human ("Anfisa", false, 55);
      Human baba2 = new Human ("Anzela", false, 63);
      Human father = new Human ("Deliver", true, 40, ded1, baba1);
      Human mother = new Human ("Nadezda", false, 38, ded2, baba2);
      Human kinder1 = new Human ("Pokemon", false, 15, father, mother);
      Human kinder2 = new Human ("Princess", false, 16, father, mother);
      Human kinder3 = new Human ("Destroyer", true, 13, father, mother);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kinder1);
        System.out.println(kinder2);
        System.out.println(kinder3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
          this.name = name;
          this.sex = sex;
          this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex=sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















