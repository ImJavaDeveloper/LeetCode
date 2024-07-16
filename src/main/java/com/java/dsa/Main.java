package com.java.dsa;

import com.java.dsa.leetCode.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main=new Main();


        //getMergeAlternately
        main.getMergeAlternately();

        main.testGreatestCommonDivisorString();

        main.testKidsWithGreaterNumberOfCandies();

        main.testCanPlaceFlowers();

        main.testReverseVowelString();

        main.testReverseWordInString();

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

    void testCanPlaceFlowers()
    {
        System.out.println("******************** Testing CanPlaceFlowers Problem");
        int [] flowerBed1={1,0,0,0,1};
        int [] flowerBed2={1,0,0,0,1};
        int [] flowerBed3={0};
        CanPlaceFlowers canPlaceFlowers=new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(flowerBed1,1));
        System.out.println(canPlaceFlowers.canPlaceFlowers(flowerBed2,2));
        System.out.println(canPlaceFlowers.canPlaceFlowers(flowerBed3,1));
        System.out.println("******************** Testing CanPlaceFlowers Problem Completed");
    }

    void testReverseVowelString()
    {
        System.out.println("******************** Testing ReverseVowelString Problem");
        ReverseVowelString reverseVowelString=new ReverseVowelString();
        System.out.println("Reverse vowel in string-hello is "+reverseVowelString.reverseVowels("hello"));
        System.out.println("Reverse vowel in string-xyza is "+reverseVowelString.reverseVowels("xyza"));
        System.out.println("Reverse vowel in string-., is "+reverseVowelString.reverseVowels(".,"));
        System.out.println("******************** Testing ReverseVowelString Problem Completed");
    }

    void testReverseWordInString()
    {
       String str="the sky is blue";
        System.out.println("******************** Testing ReverseWordInString Problem");
        ReverseWordsInString reverseWordsInString=new ReverseWordsInString();
        System.out.println(" string-"+str);
        System.out.println("Reverse Words in string-"+reverseWordsInString.reverseWords(str));
        System.out.println("******************** Testing ReverseWordInString Problem Completed");
    }

}