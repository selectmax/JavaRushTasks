package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
       HashSet<String> set = new HashSet<String>();
       set.add("арбуз");
       set.add("банан");
       set.add("вишня");
       set.add("груша");
       set.add("дыня");
       set.add("ежевика");
       set.add("жень-шень");
       set.add("земляника");
       set.add("ирис");
       set.add("картофель");

       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }


    }
}
