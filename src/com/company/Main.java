package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

	    for(int i=0; i<10; i++){
	        numbers.add((int)(1+(Math.random()*50)));
        }
        System.out.println("ArrayList: "+numbers);
	    System.out.print("Value to find: ");
	    int num = input.nextInt();

	    for(Integer val: numbers){
	        if(val.equals(num)){
	            System.out.printf("%d is in the ArrayList.\n",val);
            }
        }
    }
}
