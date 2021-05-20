package com.bridgelabz;

public class Snake_And_Ladder_Game_Builder {
    public static void main(String[] arg) {
        int random_number=0;
        while (1==1) {
            random_number = (int) (Math.floor((Math.random() * 10)) % 7);
            if(random_number!=0){
                break;
            }
        }
        System.out.println("Die number  " + random_number);
    }
}
