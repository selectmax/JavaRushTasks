package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDate = reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        try{
            dateFormat.applyPattern("MM/dd/yyyy");
            Date date = dateFormat.parse(sDate);
            dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.UK);
            System.out.println(dateFormat.format(date).toUpperCase());

        } catch (Exception e){
            System.out.println("incorrect input");
        }
    }
}
