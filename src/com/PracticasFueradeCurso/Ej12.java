package com.PracticasFueradeCurso;

public class Ej12 {
    public static void main(String[] args) {
        for(int num = 1;num<=100;num++){
            if((num%2==0) || (num%3 ==0)){ // OJO al || (o)
                System.out.println("Número: "+ num);
            }
        }

    }
}
