package com.bridgelabz;
import java.util.*;
public class Snake_And_Ladder_Game_Builder
{
    public static void main(String[] arg)
    {
        int no_of_times = 0;
        int random_number = 0;
        int total = 0;
        int myId, myValue, myDict;
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        my_dict.put("6", "-3");
        my_dict.put("10", "36");
        my_dict.put("12", "-5");
        my_dict.put("17", "80");
        random_number = (int) (Math.floor((Math.random() * 10)) % 7);
        System.out.println("random number=" + random_number);
        total = (total + random_number);
        String temp = String.valueOf(total);
        boolean flag = my_dict.containsKey(temp);
        if (flag == true)
        {
            total = (total + Integer.valueOf(my_dict.get(temp)));
        }
        System.out.println(total);
    }
}


























