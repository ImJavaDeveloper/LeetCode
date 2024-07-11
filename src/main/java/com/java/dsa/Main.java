package com.java.dsa;

import com.java.dsa.leetCode.GreatestCommonDivisorString;
import com.java.dsa.leetCode.KidsWithGreaterNumberOfCandies;
import com.java.dsa.leetCode.MergeAlternately;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main=new Main();


        //getMergeAlternately
        main.getMergeAlternately();

        main.testGreatestCommonDivisorString();

        main.testKidsWithGreaterNumberOfCandies();

    }


    void getMergeAlternately()
    {
        MergeAlternately mergeAlternately=new MergeAlternately();
        String s1="abc";
        String s2="xyz";
        System.out.println(mergeAlternately.mergeAlternately(s1,s2));
    }

    void testGreatestCommonDivisorString()
    {
        System.out.println("******************** Testing GreatestCommonDivisorString Problem");
        GreatestCommonDivisorString greatestCommonDivisorString=new GreatestCommonDivisorString();
        String s1="ABABAB";
        String s2="ABAB";
        System.out.println("GreatestCommonDivisorString:"+greatestCommonDivisorString.gcdOfStrings(s1,s2));
        String s3="ABCABC";
        String s4="ABC";
        System.out.println("GreatestCommonDivisorString:"+greatestCommonDivisorString.gcdOfStrings(s3,s4));
        String s5="ABC";
        String s6="LEET";
        System.out.println("GreatestCommonDivisorString:"+greatestCommonDivisorString.gcdOfStrings(s5,s6));
        String s7="ABCEFG";
        String s8="ABC";
        System.out.println("GreatestCommonDivisorString:"+greatestCommonDivisorString.gcdOfStrings(s7,s8));
        System.out.println("******************** Testing GreatestCommonDivisorString Problem Completed\n");
    }

    void testKidsWithGreaterNumberOfCandies()
    {
        System.out.println("******************** Testing KidsWithGreaterNumberOfCandies Problem");
        int []candies1={2,3,5,1,3};
        int []candies2={4,2,1,1,2};
        int []candies3={2,8,7};

        KidsWithGreaterNumberOfCandies kidsWithGreaterNumberOfCandies=new KidsWithGreaterNumberOfCandies();
        System.out.println(kidsWithGreaterNumberOfCandies.kidsWithCandies(candies1,3));
        System.out.println(kidsWithGreaterNumberOfCandies.kidsWithCandies(candies2,3));
        System.out.println(kidsWithGreaterNumberOfCandies.kidsWithCandies(candies3,3));
        System.out.println("******************** Testing KidsWithGreaterNumberOfCandies Problem Completed");
    }


}