package com.dsa.day2;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {

    public static List<Integer> mergeTwoList(List<Integer>l1,List<Integer>l2){
        int i=0,j=0;
        List<Integer> ans = new ArrayList<>();
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<=l2.get(j)){
               ans.add(l1.get(i));
               i++;
            }
            else if(l1.get(i)>l2.get(j)){
                ans.add(l2.get(j));
                j++;
            }
        }

        while(i<l1.size()){
            ans.add(l1.get(i));
            i++;
        }

        while(j<l2.size()) {
            ans.add(l2.get(j));
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,4,5);
        List<Integer> l2 = List.of(1,3,4);

        List<Integer> merge = mergeTwoList(l1,l2);
        System.out.println(merge);

    }
}
