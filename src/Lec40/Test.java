package Lec40;

import java.util.*;

public class Test {
    /*
    A function that will traverse the array and find the next greater element of each element using stack. It will also print the result.
    */
    static void nextGreaterElement(int a[], int n) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            // If the stack is empty, push the current element.
            if (s.isEmpty()) {
                s.push(a[i]);
                continue;
            }

			/*
			We need to keep on popping the elements from the top of the stack until the top element is smaller than the current element.
			*/
            while (!s.isEmpty() && s.peek() < a[i]) {
                System.out.println(s.pop() + " --> "
                        + a[i]);
            }

            // push or insert the nextGreater i.e. current element into the stack and after the iteration.
            s.push(a[i]);
        }
		/*
		pop all the elements from the stack and print -1 as the next greater element for them.
		*/
        while (!s.isEmpty()) {
            System.out.println(s.pop() + " --> "
                    + "-1");
        }

    }

    public static void main(String args[]) {

        int a[] = { 11, 13, 21, 3 };
        int n = a.length;

        // calling the function that will print the next greater element of array elements
        System.out.println("The list of the next greater element is :");
        nextGreaterElement(a, n);
    }
}
