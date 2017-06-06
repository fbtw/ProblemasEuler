package com.example.fborja.myapplication;

import android.provider.Settings;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by fborja on 5/6/17.
 */

public class Euler {
    public Euler() {
    }

    public static int primero(){
        int sum=0;
        for (int i=1;i<1000;i++){
                if ((i%3==0)||(i%5==0)){sum+=i;}
        }
    return sum;
    }
    public static int segundo(){
        int a=0,b=1,sum=0;
        do {
            a=a+b;
            b=a+b;
            if (a%2==0)sum+=a;
            if (b%2==0)sum+=b;
            System.out.print(a +" "+b+" ");
        } while (b<4000000);

        return sum;
    }
    public static int tercero(){
        long a=600851475143L,i,n=0;
        for (i=3;i<Math.sqrt(a);i+=2){
            if (esprimo(i)){
                if (a%i==0){n=i;
                    System.out.println(i+" ");}
            }
        }
        return (int)n;
    }

public static boolean esprimo(long x) {
    for (int i = 2; i < (x / 2); i++) {
        if (x % i == 0) return false;
    }
    return true;
}

}
