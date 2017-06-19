package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable, Updatable {
        public void onSelect(){
            System.out.println("selected");
        }
        public void refresh(){
            System.out.println("refreshed");
        };
    }
}
