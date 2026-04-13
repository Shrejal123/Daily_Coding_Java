package com.dsa.day1;

import java.util.Arrays;

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int count0=0,prod=1;

        for(int num:nums){
            if(num==0)count0++;
            else{
                prod=prod*num;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=0 && count0>=1){
                nums[i]=0;
            }
            else if(nums[i]==0 && count0==1){
                nums[i]=prod;
            }
            else if(nums[i]==0 && count0>1){
                nums[i]=0;
            }

            else{
                nums[i]=prod/nums[i];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        ProductOfArrayExceptSelf s = new ProductOfArrayExceptSelf();
        int[] ans = s.productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
}
