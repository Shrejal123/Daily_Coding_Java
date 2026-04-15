package com.dsa.day2;

import java.util.*;
class SortStack{
    public static void main(String[] args) {
        Stack<Integer>numStack = new Stack<>();
        numStack.push(23);
        numStack.push(1);
        numStack.push(3);
        numStack.push(8);

        System.out.println(sortStack(numStack));

    }
    public static Stack<Integer> sortStack(Stack<Integer>numStack){
        List<Integer> ls = new ArrayList<>();
        int n = numStack.size();
        while(!numStack.isEmpty()){
            ls.add(numStack.peek());
            numStack.pop();

        }
        Collections.sort(ls,(a,b)->b-a);

        Stack<Integer> st = new Stack<>();
        for(int num:ls){
            st.push(num);
        }
        return st;
    }
}