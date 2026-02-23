package com.DSApractice.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(duplicateBrackets(s));
    }

    public static boolean duplicateBrackets(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (ch == ')') {
                    if (st.size() > 0) {
                        if (st.peek() == '(') {
                            st.pop();
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (st.size() > 0) {
                        if (st.peek() == '{') {
                            st.pop();
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (st.size() > 0) {
                        if (st.peek() == '[') {
                            st.pop();
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return (st.size() == 0 ? true : false);
    }
}