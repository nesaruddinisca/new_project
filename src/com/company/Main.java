package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any integer : ");
        num = input.nextInt();
        int sum = 0;
        while (num >= 0) {
            sum = sum + num;
            System.out.print("Enter any integer : ");
            num = input.nextInt();

        }
        System.out.println("Positiv" + sum);

    }
}
