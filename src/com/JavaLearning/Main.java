package com.JavaLearning;

public class Main {

    public static void main(String[] args) {
	 checkNumber(4);
	 checkNumber(-3);
	 checkNumber(0);
    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("Positive");
        } else if(number < 0){
            System.out.println("negative");
        } else if(number == 0){
            System.out.println("Zero");
        }
    }
}
