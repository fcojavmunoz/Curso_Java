package com.PracticasFueradeCurso;

public class Testing_Noa {

            public static void main(String[] args) {
            char[] arr = {'2','3','4','5'};
            int val = contains(arr);
            System.out.println("Int value after conversion : "+val);
        }
        public static int contains(final char[] arr) {
            int number = Integer.parseInt(String.valueOf(arr));
            return number;
        }
    }

