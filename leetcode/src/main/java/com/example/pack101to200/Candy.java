package com.example.pack101to200;

import java.util.Arrays;

/**
 * Created by majie on 16/5/27.
 */
public class Candy {

    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        for(int i =1; i<ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1;
            }
        }

        for(int i=ratings.length -2; i>-1;i--){
            if(ratings[i]>ratings[i+1] && candies[i] <=candies[i+1]){
                candies[i] = candies[i+1]+1;
            }
        }

        int sum =0;
        for(int i=0;i<candies.length;i++){
            sum += candies[i];
        }

        return sum;
    }
}
