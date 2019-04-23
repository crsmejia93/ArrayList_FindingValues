package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count=0;
        boolean valueFound = false;
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
	            count++;
	            valueFound=true;
            }
        }
        if(valueFound){
            System.out.printf("%d was found %d times.\n",num,count);
        }else{
            System.out.printf("%d was not found.\n",num);
        }
    }
}
