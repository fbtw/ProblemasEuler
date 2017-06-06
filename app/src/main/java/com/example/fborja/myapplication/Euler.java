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
                if (a%i==0){
                    n=i;
                    System.out.println(i+" ");}
            }
        }
        return (int)n;
    }
    public static int cuarto(int dig){
        int x=0,i,j,k;
        int max=(int)Math.pow(10,dig),init=(int)Math.pow(9,dig);
        System.out.println("max "+max+" "+init);
        for (i=init;i<max;i++){
            for (j=init;j<max;j++){
                k=i*j;
                if (pally(k)){
                    x=k;
                    System.out.print(x+" ");
                }
            }
        }

        return x;
    }

    public static int quinto(int m){
        return MCM(m,m-1);
    }

    public static int MCM(int x,int y) {
        //int x=72,y=50;
        int i,ñ,mcm=1;
        int [] primos={ 2, 3, 0, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] factoresX = factoresprimos(x);
        int[] factoresY = factoresprimos(y);
        for (i=0;i<11;i++){
            if (factoresX[i]>=factoresY[i]){
                ñ=factoresX[i];
            }else{
                ñ=factoresY[i];
            }
            ñ=(int) Math.pow(primos[i],ñ);
            if (ñ>0)mcm*=ñ;
        }

        if (y==1) return mcm;
        else return MCM(mcm,y-1);
    }

    public static int[] factoresprimos(int x) {
        int i,j=0;
        int[] factores = new int[11]; // 2, 3, ?, 5, 7, 11, 13, 17, 19, 23, 29
        //int max=x;
        for (i=2;i<30;i++){
            if (esprimo(i)) {
                while (x%i==0){
                    factores[j]++;
                    x /= i;
                }
                j++;
            }
        }
        //comprobar
        System.out.println("2: "+ factores[0]);
        System.out.println("3: "+ factores[1]);
        System.out.println("?: "+ factores[2]);
        System.out.println("5: "+ factores[3]);
        System.out.println("7: "+ factores[4]);
        System.out.println("11: "+factores[5]);
        System.out.println("13: "+factores[6]);
        System.out.println("17: "+factores[7]);
        System.out.println("19: "+factores[8]);
        System.out.println("23: "+factores[9]);
        System.out.println("29: "+factores[10]);
        //System.out.println("31: "+factores[11]);
        return factores;
    }

public static boolean esprimo(long x) {
    for (int i = 2; i < (x / 2); i++) {
        if (x % i == 0) return false;
    }
    return true;
}
    public static boolean pally(int x) {
        //System.out.println(x+" == "+alrevés(x));
        if (alrevés(x)==x)return true;
        return false;
    }
    public static int alrevés(int n) {
        return Integer.parseInt((new StringBuffer(String.valueOf(n))).reverse().toString());
    }


}
