package com.javarush.task.task08.task0814;

import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
     HashSet<Integer> hashset = new HashSet<Integer>();
     for (int i=0; i<20; i++) {
         hashset.add(i);
     } return (hashset);

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet res = (HashSet) set.clone();
        for (Integer num : set) {
            if (num > 10) res.remove(num);
        }
        return res;

    }

    public static void main(String[] args) {
HashSet<Integer> a=createSet();
a = removeAllNumbersMoreThan10(a);

    }
}
