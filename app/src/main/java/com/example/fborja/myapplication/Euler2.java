package com.example.fborja.myapplication;

import android.provider.Settings;

/**
 * Created by fborja on 8/6/17.
 */

public class Euler2 {
    public static int sexto (int n){
        int sc=sumacuadrados(n),cs=cuadradosuma(n);
        System.out.println("sc "+sc+" cs "+cs);
    return cs-sc;
    }
    public static int séptimo (int n) {
        int c = 1,i=1;
        boolean primo;
        //System.out.println("1: 2");
        while (c<n){
            i+=2;
            primo=true;
            for (int j = 2; j < (i / 2); j++) {
                if (i % j == 0) primo=false;
            }
            if (primo){
                c++;
                //System.out.println(c+": "+i);
            }
        }
        return i;
    }
    private static int sumacuadrados(int n){
        int i,sum=0;
        for (i=1;i<=n;i++){
            sum+=Math.pow(i,2);
        }

        return sum;
    }
    private static int cuadradosuma(int n){
        int i,pow,sum=0;
        for (i=1;i<=n;i++){
            sum+=i;
        }
        pow=(int)Math.pow(sum,2);
        return pow;
    }

}
