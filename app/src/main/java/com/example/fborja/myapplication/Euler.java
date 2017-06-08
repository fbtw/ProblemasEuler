package com.example.fborja.myapplication;

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

    //public static int quinto(int m){return MCM(m,m-1);}

    public static int quinto(int x,int y) { //funcion recursiva, calcula el minimo comun multiplo del resultado del mismo
        int i,ñ,mcm=1;                      //y el 2do valor hasta que este 2do valor sea 1.
        int [] primos={ 2, 3, 0, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] factoresX = factoresprimos(x);
        int[] factoresY = factoresprimos(y);
        for (i=0;i<11;i++){
            if (factoresX[i]>=factoresY[i]){    //los factores primos mayores absorven a los menores
                ñ=factoresX[i];
            }else{
                ñ=factoresY[i];
            }
            ñ=(int) Math.pow(primos[i],ñ);
            if (ñ>0)mcm*=ñ;
        }
        if (y==1) return mcm;
        else return quinto(mcm,y-1);
    }

    private static int[] factoresprimos(int x) {    //la lista resultante contiene las potencias de cada primo, no los factores en sí.
        int i,j=0;                    //Ej si no es divisible para 3 entonces 3^0=1
        int[] factores = new int[11]; // 2, 3, ?, 5, 7, 11, 13, 17, 19, 23, 29
        for (i=2;i<30;i++){           //el número máximo es 6469693230 exceptuando todos los primos mayores de 29
            if (esprimo(i)) {
                while (x%i==0){
                    factores[j]++;
                    x /= i;
                }
                j++;
            }
        }
        //comprobar
        //System.out.println("2 3   5 7 11 13 17 19 23 29  ");
        for(int k:factores){ System.out.print(factores[k]+" ");}
        System.out.println();
        return factores;
    }

    private static boolean esprimo(long x) {
        for (int i = 2; i < (x / 2); i++) {
            if (x % i == 0) return false;
        }
    return true;
}
    private static boolean pally(int x) {
        if (alrevés(x)==x)return true;
        return false;
    }
    private static int alrevés(int n) {//stringbuffer es la forma mas fácil de reversar un valor independiente de su tipo.
        return Integer.parseInt((new StringBuffer(String.valueOf(n))).reverse().toString());
    }


}
