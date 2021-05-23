package com.bridgelabz;
import java.util.*;
public class Snake_And_Ladder_Game_Builder
{
    public static void main(String[] arg)
    {
        int random_number = 0;
        int total = 0;
        int myId, myValue, myDict;
        int no_of_times=0;
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        my_dict.put("6", "-3");
        my_dict.put("10", "36");
        my_dict.put("12", "-5");
        my_dict.put("17", "80");
        while (true)
        {
            no_of_times++;
            random_number = (int) (Math.floor((Math.random() * 10)) % 7);
            if(random_number==0)
            {
                continue;
            }
            System.out.println("Dice number = " + random_number);

            if (total+random_number > 100)
            {
                continue;
            }
            total = (total + random_number);
            String temp = String.valueOf(total);
            boolean flag = my_dict.containsKey(temp);
            if (flag == true)
            {
                total = (total + Integer.valueOf(my_dict.get(temp)));
            }
            System.out.println("Position = " + total);
            if (total >= 100)
            {
                break;
            }
        }
        System.out.println("Number of times the dice roll to win the game = " + String.valueOf(no_of_times));


    }
}


























