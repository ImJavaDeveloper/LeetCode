package com.java.dsa.leetCode;

public class ReverseWordsInString {

    public String reverseWords(String s) {

        String [] words=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            if(words[i].trim().length()>0)
                stringBuilder.append(words[i].trim()).append(" ");

        }

        return new String(stringBuilder).trim();
    }
}
