package com.java;

public class Quadratic {

        public int deltaEquation(int a, int b, int c){

            int delta=(b*b - (4*a*c));
            return delta;
        }
        public void findRoots(int a, int b,int c){
                double root1OfX=(-b + Math.sqrt(deltaEquation(a,b,c)))/(2*a);
                double root2OfX=(-b - Math.sqrt(deltaEquation(a,b,c)))/(2*a);

            System.out.println("The value of root 1 of x is :"+root1OfX);
            System.out.println("The value of root 2 of x is :"+root2OfX);
            }
    public static void main(String[] args) {
            Quadratic obj=new Quadratic();
            obj.findRoots(1,-5,6);
    }

}
