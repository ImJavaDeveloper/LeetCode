package com.java.dsa.leetCode;

public class ReverseVowelString {

    public String reverseVowels(String s) {
        char [] vowels={'a','e','i','o','u'};
        int left=0;
        int right=s.length()-1;
        char [] chars=s.toCharArray();

        while(right>left){

            while(!(left >=s.length()) && !String.valueOf(vowels).toLowerCase().contains(String.valueOf(chars[left]).toLowerCase()))
                left++;
            while(!(right <0) && !String.valueOf(vowels).toLowerCase().contains(String.valueOf(chars[right]).toLowerCase()))
                right--;
            //swap the char
            if(right>left){
                char temp=chars[right];
                chars[right]=chars[left];
                chars[left]=temp;
            }
            left++;
            right--;

        }

        return new String(chars);
    }
}
