package NestedLoopsExercise;

import com.sun.jdi.IntegerValue;

public class demo {
    public static void main(String[] args) {
        int i = 1234;
        String number = "" + i;
        int k = 1;
        char last = number.charAt(k);
        int lastLast = last - '0';
        System.out.println(lastLast);
        ///
    }
}
