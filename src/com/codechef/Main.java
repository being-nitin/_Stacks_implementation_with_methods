package com.codechef;
import java.util.Stack;
import java.util.Scanner;
import java.util.Iterator;
public class Main {

    public static void main(String[] args) {
	/*
	stacks:
	stacks is the subclass of vector, it implements the last in first out data structure;
	 */
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 3; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println(stack);
        /* with peak method it will return the peek element in the stack that is the last element
        that is the third element
         */
        System.out.println(stack.peek());

    }
}