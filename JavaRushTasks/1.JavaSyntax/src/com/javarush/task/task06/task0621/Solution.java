package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat (grandFatherName, null, null);

        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat (grandMotherName, null, null);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grandFather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, grandMother, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mother, father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if ((mother == null) && (father == null))
                return "Cat name is " + name + ", no mother, no father";
            else if (father==null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else if (mother==null)
                return "Cat name is " + name + ", no mother, father is " + father.name;
            else return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
