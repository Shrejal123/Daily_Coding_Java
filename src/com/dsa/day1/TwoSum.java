package com.dsa.day1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //1.Two Sum Problem --  Find 2 numbers whose sum = target

    public static int[] twoSum(int[]nums,int target){
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            int left = target-nums[i];

            if(hm.containsKey(left)){
                return new int[]{hm.get(i),i};
            }

            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }


    public static void main(String[] args) {
          int[] arr = {2,1,4,9,5};
          int target = 9;
          int result[] = twoSum(arr,target);

        System.out.println(Arrays.toString(result));
    }
}

