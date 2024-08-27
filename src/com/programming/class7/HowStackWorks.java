package com.programming.class7;

import java.util.Stack;

public class HowStackWorks {

    public static void main(String[] args) {
//        with stack,you have push and pop to add and retrieve elements
//        element added last will be retrieved first
        Stack<Integer> stOfData = new Stack<>();
        showPush(stOfData, 1);
        showPush(stOfData, 2);
        showPush(stOfData, 3);
        showPop(stOfData);
        showPop(stOfData);
    }

    static void showPush(Stack<Integer>st, Integer a) {
        st.push(a);
        System.out.println("After adding, stack Data is "+ st);
    }

    static void showPop(Stack<Integer> st) {
        st.pop();
        System.out.println("After popping, Stack data is "+ st);
    }
}
