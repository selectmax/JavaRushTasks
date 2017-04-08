package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Мальцев1", "Максим");
        map.put("Мальцев2", "Павел");
        map.put("Мальцев3", "Владимир");
        map.put("Мальцева4", "Светлана");
        map.put("Жолудева5", "Юлия");
        map.put("Жолудева6", "Ирина");
        map.put("Жолудев7", "Константин");
        map.put("Мальцев8", "МаксимВторой");
        map.put("Мальцев9", "МаксимТретий");
        map.put("МальцевВторой10", "Максим");
        return (HashMap<String, String>) map;


    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int a=0;
        for (String str : map.keySet()) {
            if (name.equals(map.get(str))) a+=1;
        }
        return a;//напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        if (map.containsKey(lastName)) return 1;
        else return 0;//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
