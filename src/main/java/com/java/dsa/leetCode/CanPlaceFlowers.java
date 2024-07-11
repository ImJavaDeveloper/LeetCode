package com.java.dsa.leetCode;

/**You have a long flowerbed in which some of the plots are planted, and some are not. However,
flowers cannot be planted in adjacent plots.Given an integer array flowerbed containing 0's and 1's,
where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers
can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false**/

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            //If no plant is left
            if(n==0)
                break;
            //Check for array having one element
            if(len==1 && flowerbed[i] == 0)
                return true;
            //Check for first place
            if (i == 0 && len>1) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                    n--;
                    flowerbed[i]=1;
                }
            }
            //Check for availablity at last place
            if (i == (len - 1) && len>1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0){
                    n--;
                    flowerbed[i]=1;
                }
            }
            //check for availablity at in between of the array
            else if (len>2 && flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                n--;
                flowerbed[i]=1;
            }
        }
        if (n == 0)
            return true;
        else
            return false;
    }
}
