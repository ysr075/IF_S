package com.company;

import java.util.Scanner;

class and_not_xor {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int IF1;
        System.out.print("\nIF1: ");
        IF1 = input.nextInt();
        int IF2;
        System.out.print("\nIF2: ");
        IF2 = input.nextInt();
        int IF3;
        System.out.print("\nIF3: ");
        IF3 = input.nextInt();
        if (IF1 == 1 && IF2 == 1 && IF3 == 1) {
            System.out.print("\n(255,255,0)\n");
        } else if (IF1 == 1 && IF2 == 1 && IF3 == 0) {
            System.out.print("\n(0,0,0)\n");
        }
    }
}

public class build_input_xor {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        do {
            and_not_xor.StaticMethod();
        } while (true);
    }
}
