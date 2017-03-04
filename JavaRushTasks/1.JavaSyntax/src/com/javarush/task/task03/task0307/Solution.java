package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg[] zergs = new Zerg[10];
        Protoss[] prottoses = new Protoss[5];
        Terran[] terrans = new Terran[12];

        for (int i = 0; i < zergs.length; i++) {
            zergs[i] = new Zerg();
            zergs[i].name = "zerg" + i;

        }
        for (int i = 0; i < prottoses.length; i++) {
            prottoses[i] = new Protoss();
            prottoses[i].name = "prot" + i;

        }
        for (int i = 0; i < terrans.length; i++) {
            terrans[i] = new Terran();
            terrans[i].name = "ter" + i;   //напишите тут ваш код
        }
    }

        public static class Zerg {
            public String name;
        }

        public static class Protoss {
            public String name;
        }

        public static class Terran {
            public String name;
        }
    }
