package com.example.pack101to200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by majie on 16/5/13.
 */
public class WordBreak2 {

    public static List<String> wordBreak(String s, Set<String> wordDict) {
        if (wordDict.contains(s)) {
            List<String> result = new ArrayList<String>();
            result.add(s);
            return result;
        }

        //record possible check point
        Set<Integer> index = new HashSet<Integer>();
        if (index.isEmpty()) {
            for (String str : wordDict) {
                index.add(str.length());
            }
        }

        //check if the word is breakable
        boolean[] breakable = new boolean[s.length() + 1];
        breakable[0] = true;
        for (int i = 1; i < s.length() + 1; i++) {
            for (Integer num : index) {
                int temp = i - num;
                if (temp > -1) {
                    //if sub string match && any check point is true, set true
                    if (wordDict.contains(s.substring(temp, i)) && breakable[temp]) {
                        breakable[i] = true;
                        break;
                    }
                }
            }
        }
        if(!breakable[s.length()]){
            return new ArrayList<String>();
        }

        //compute word list
        //can use the previous boolean[] array to simplify the loop
        ArrayList<LinkedList<String>> dp =  new ArrayList<LinkedList<String>>();
        for(int i = 0; i < s.length()+1; i++){
            dp.add(new LinkedList<String>());
        }

        for (int i = 1; i < s.length() + 1; i++) {
            for (Integer num : index) {
                int temp = i - num;
                if (temp > -1) {
                    if (wordDict.contains(s.substring(temp, i)) && (!dp.get(temp).isEmpty() || temp ==0)) {
                        if(temp == 0){
                            dp.get(i).add(s.substring(temp,i));
                        }else{
                            for(String str: dp.get(temp)){
                                dp.get(i).add(str+" "+s.substring(temp,i));
                            }
                        }
                    }
                }
            }
        }

        return dp.get(s.length());
    }
}
