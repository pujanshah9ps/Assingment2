package com.mpstme;
import java.io.*;
public class Main {
//    function to check neon number
    static boolean checkNeon(int x)
    {
//        storing the value of square
        int sqr = x*x;

//        to calculate the sum
        int sum = 0;
        while(sqr!=0){
            sum = sum + sqr%10;
            sqr = sqr/10;
        }
        return(sum == x);

    }


    public static void main(String[] args)
    throws IOException{
//        for loop helps printing number upto 1000
        for(int i = 1; i<=1000; i++)
            if(checkNeon(i))
                System.out.println(i+" ");


    }
}
