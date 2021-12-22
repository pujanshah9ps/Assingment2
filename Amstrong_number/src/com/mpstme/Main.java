package com.mpstme;

public class Main {
    int power(int x, long y)
//            function to calculate  x to the power y
    {
        if (y==0)
            return 1;
        if(y%2==0)
            return power(x,y/2)*power(x,y/2);
            return x*power(x,y/2)*power(x,y/2);

    }
//    function to calculate order of number
    int order(int x)
    {
        int n=0;
        while(x!=0) {
            n++;
            x = x / 10;
        }
        return n;
    }
//    check wether amstrong number or not
    boolean isAmstrong(int x )
    {
        int n = order(x);
        int temp =x, sum = 0;
        while(temp!=0){
            int r = temp %10;
            sum = sum + power(r,n);
            temp=temp/10;

        }
        return(sum==x);
    }
    public static void main(String[] args) {
        Main ob = new Main();
        int x = 153;
        System.out.println(x+" "+ob.isAmstrong(x));
        x = 3999;
        System.out.println(x+" "+ob.isAmstrong(x));


    }
}
