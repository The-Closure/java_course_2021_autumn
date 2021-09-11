package org.closure;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int a = 51;
        int b = 1;
        int res = b / a;
        // + - / * %

        char c = 'c';
        String s = "a  + b = " + (a + b);

        boolean b1 = true;
        boolean b2 = false;
        // && || !

        System.out.println(b1 && b2);
        System.out.println(!b1);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        int k;
        do {
            k = 0; // user input
        } while (k < 10);

        if (b1) {
            System.out.println("b1");
        } else if (b2) {
            System.out.println("b2");
        } else {
        }

        if (b1) {
            System.out.println("hi");
            System.out.println("Hi2");
            System.out.println("hi3");
        }

        System.out.println(s);
        System.out.println("Hello World!");
        System.out.println("hello world");

    }
}
