package com.java;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a=5,b=10,c=15;
        int prob1=a+b*c;
        System.out.println("The answer of problem 1 is: "+prob1);
        int prob2=c+a/b;
        System.out.println("The answer of problem 2 is: "+prob2);
        int prob3=a%b+c;
        System.out.println("The answer of problem 3 is: "+prob3);
        int prob4=a*b+c;
        System.out.println("The answer of problem 4 is: "+prob4);

        System.out.println("Finding the maximum value from all the problems");
     if(prob1>prob2 && prob1>prob3 && prob1>prob4){
         System.out.println("The value of problem 1 is maximum i.e "+prob1);
     }else if(prob2>prob1 && prob2>prob3 && prob2>prob4){
         System.out.println("The value of problem 2 is maximum i.e "+prob2);
     }else if(prob3>prob1 && prob3>prob2 && prob3>prob4){
         System.out.println("The value of problem 3 is maximum i.e "+prob3);
     }else{
         System.out.println("The value of problem 4 is maximum i.e "+prob4);
     }

        System.out.println("Finding the minimum value from all the problems");
        if(prob1<prob2 && prob1<prob3 && prob1<prob4){
            System.out.println("The value of problem 1 is minimum i.e "+prob1);
        }else if(prob2<prob1 && prob2<prob3 && prob2<prob4){
            System.out.println("The value of problem 2 is minimum i.e "+prob2);
        }else if(prob3<prob1 && prob3<prob2 && prob3<prob4){
            System.out.println("The value of problem 3 is minimum i.e "+prob3);
        }else{
            System.out.println("The value of problem 4 is minimum i.e "+prob4);
        }
    }
}