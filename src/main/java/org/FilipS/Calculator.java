package org.FilipS;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public boolean isPositive(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int a){
        if(a % 2 != 0){
            return true;
        } else {
            return false;
        }
    }

    public int min(int a, int b){
        if (a < b){
            return a;
        } else {
            return b;
        }
    }

    public int max(int a, int b){
        if (a < b){
            return b;
        } else {
            return a;
        }
    }

    public double average(int a, int b){
        return a + b / (double)2;
    }

    public int power(int a, int x){
        int pow = a;
        for(int i = 1; i < x; i++){
            pow *= a;
        }
        return pow;
    }





}
