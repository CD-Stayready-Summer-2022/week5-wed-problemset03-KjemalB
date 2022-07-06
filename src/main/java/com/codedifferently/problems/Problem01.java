package com.codedifferently.problems;

import java.util.*;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        HashMap<String, Integer> hashMap = new HashMap();
        input = input.toLowerCase();

        for(int i =0 ; i < input.length();i++){
            if(hashMap.containsKey(String.valueOf(input.charAt(i)))&& hashMap.isEmpty() == false){
                hashMap.put(String.valueOf(input.charAt(i)), hashMap.get(String.valueOf(input.charAt(i)))+1);
            }
            else{
                hashMap.put(String.valueOf(input.charAt(i)), 1);
            }
        }
        System.out.print(hashMap.toString());
        return hashMap.get(letter);
    }
}