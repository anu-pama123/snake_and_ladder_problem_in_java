package com.bridgelabz;
import java.util.*;
public class Snake_And_Ladder_Game_Builder
{
    public static void main(String[] arg)
    {
        int random_number = 0;
        int player1_total = 0;
        int player2_total = 0;
        int current_player = 1;
        int myId, myValue, myDict;
        int player1_no_of_times=0;
        int player2_no_of_times=0;
        String winner;
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        my_dict.put("6", "-3");
        my_dict.put("10", "36");
        my_dict.put("12", "-5");
        my_dict.put("17", "80");
        while (true)
        {
            String temp;
            random_number = (int) (Math.floor((Math.random() * 10)) % 7);
            if(random_number==0)
            {
                continue;
            }
            System.out.println("Dice number = " + random_number);
            if(current_player==0){
                if (player1_total+random_number > 100)
                {
                    current_player ^= 1;
                    continue;
                }
                player1_total = (player1_total + random_number);
                player1_no_of_times++;
                temp = String.valueOf(player1_total);
            }else{
                if (player2_total+random_number > 100)
                {
                    current_player ^= 1;
                    continue;
                }
                player2_total = (player2_total + random_number);
                player2_no_of_times++;
                temp = String.valueOf(player2_total);
            }
            current_player ^= 1;
            boolean flag = my_dict.containsKey(temp);
            if (flag == true)
            {
                if(current_player==0) {
                    player1_total = (player1_total + Integer.valueOf(my_dict.get(temp)));
                }else{
                    player2_total = (player2_total + Integer.valueOf(my_dict.get(temp)));
                }
                if(Integer.valueOf(my_dict.get(temp))>0){
                    current_player ^= 1;
                }
            }
            System.out.println("player1 = " + player1_total);
            System.out.println("player2 = " + player2_total);
            if (player1_total >= 100 || player2_total >= 100)
            {
                if(player1_total>=100){
                    System.out.println("Player1 won the game");
                    System.out.println("Number of times the dice roll to win the game = " + String.valueOf(player1_no_of_times));
                }
                else {
                    System.out.println("Player2 won the game");
                    System.out.println("Number of times the dice roll to win the game = " + String.valueOf(player2_no_of_times));
                }
                break;
            }
        }



    }
}


























