package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int[] n = new int[3];
        for (int i=0; i<3; i++) {
           String sAge = reader.readLine();
           n[i] = Integer.parseInt(sAge);
       }
       if (n[0]==n[1]) System.out.println(n[0]);
        else if (n[2]==n[1]) System.out.println(n[1]);
        else if (n[2]==n[0]) System.out.println(n[2]);
        else {
       int mid=n[0];
       if ((n[0]<n[1] && n[0]>n[2]) || (n[0]>n[1] && n[0]<n[2])) mid = n[0];
       if ((n[1]<n[0] && n[1]>n[2]) || (n[1]>n[0] && n[1]<n[2])) mid = n[1];
       if ((n[2]<n[1] && n[2]>n[0]) || (n[2]>n[1] && n[2]<n[0])) mid = n[2];
        System.out.println(mid);}
    }
}
