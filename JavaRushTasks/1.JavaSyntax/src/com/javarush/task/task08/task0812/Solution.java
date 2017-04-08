package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
      ArrayList<Integer> list= new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      for (int i=0; i<10; i++){
        list.add(Integer.parseInt(reader.readLine()));
      }
      int result=1;
      int tekushee=1;


      for (int i=1; i<10; i++){
         if (list.get(i)==list.get(i-1)) {
             tekushee+=1;
          }
          else { if (tekushee>result) result=tekushee;
                tekushee = 1;}
      }
        if (tekushee>result) System.out.println(tekushee);
        else System.out.println(result);
    }
}