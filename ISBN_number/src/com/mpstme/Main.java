package com.mpstme;

public class Main {

    public static void main(String[] args) {
//        number is declared
        int num = 1259060977;
        int count = 0, temp = num, sum = 0, remainder;

//        running the loop to get the sum
        while (temp>0){
            remainder=temp%10;
            temp /= 10;
            sum += remainder*count++;

        }
//        dividing with 11 to check the condition
        if(sum%11==0){
            System.out.println(num+"is an ISBN number");

        }
        else {
            System.out.println(num+"is not ISBN number");
        }


    }
}
