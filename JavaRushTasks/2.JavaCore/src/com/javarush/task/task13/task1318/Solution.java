package com.javarush.task.task13.task1318;
import java.io.*;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String thePath = reader.readLine();
        InputStream inStream = new FileInputStream(thePath);
        while (inStream.available() > 0)
                        {
                        System.out.print((char)inStream.read());
                        }
        System.out.println();
        inStream.close();
        reader.close();
    }
}