package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej_Noa {
    public static void main(String[] args) {

        int[]digits = new int[3]; // Creating the array so it can save 3 digits in it.
        int num = 0; // Declaring the variable that will save the number we will write.
        int size = 0; // Creating the variable that will save num.length.
        String chain = ""; // Creating the variable String that will save the array numbers in a String.

        // Creating a method so we will be sure the number we enter has exactly 3 digits.

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Please, type a 3 digits number: ");
            num = entrada.nextInt(); // Saves the number we enter example: <123>
            chain = String.valueOf(num); // Convert this number into a String so we can use the .length method <"123">
            size = chain.length(); // Saves the number´s length.
            
        } while(size != 3); // Now we are sure the number has exactly 3 digits.

        /*
        We run over the array and detect the non even digits.
        When detected, substract 1 (-1) and keeps all the numbers in the array.
         */
        for ( int i = 0; i < size; i++){
            digits[i] = Integer.parseInt(chain.substring(i,i+1));
            if (digits[i] % 2 != 0){
                digits[i] = digits[i] - 1;
            }
        }
        // Creating a method that will convert the array components in a number.

        StringBuilder strNum = new StringBuilder();
        for (int dig : digits)
        {
            strNum.append(dig);
        }
        int finalInt = Integer.parseInt(strNum.toString());
        System.out.println(finalInt);
    }


}

