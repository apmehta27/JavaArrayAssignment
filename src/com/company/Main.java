package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Problem 1 : Write a program that creates an array of integers with a length
        of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
	     int [] values = new int[3];
         values[0] = 1;
         values[1] = 2;
         values[2] = 3;
         System.out.println(Arrays.toString(values)); // 1st Method

        Problem 2 : Write a program that returns the middle element in an array.Give the following values
        to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7


        int [] arrayOne = {13, 5, 7, 68, 2};
        System.out.println("The output for the number 7 is index 2: " + arrayOne[2]);

        Problem 3 : Write a program that creates an array of String type and initializes it with the strings
        “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( )
        method.Use the Arrays.toString( ) method on the new array to verify that the original array
        was copied.

        String [] color = {"red", "green", "blue", "yellow"};
        System.out.println("The length of the string array is: "+ color.length);
        String[] newColor = color.clone();
        System.out.println("The clone array newColor from original array color will be same as follows: "+
        "\n" + Arrays.toString(newColor));

        Problem 4: Write a program that creates an integer array with 5 elements (i.e., numbers). The
        numbers can be any integers.  Print out the value at the first index and the last index using
        length - 1 as the index. Now try printing the value at index = length
        ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced.
        Now try to assign a value to the array index 5. You should get the same type of exception.



        int[] newArray = {1,2,3,4,5} ;
        int firstArray = newArray[0] ;
        int lastArray = newArray[newArray.length -1];
        System.out.printf("Print the number at first index and last index: %d and %d ", firstArray,lastArray );
//        int lastIndexArray = myArray[myArray.length];
//        System.out.println("Print the last index = length" + lastIndexArray);
        newArray[5] = 6 ;
        System.out.println("assign a value to the array at index 5" + newArray);

        Problem:5 Write a program where you create an integer array with a length of 5. Loop through the
        array and assign the value of the loop control variable (e.g., i) to the corresponding index in
        the array.


        int[] myArray =  {1,2,3,4,5};
        for(int i=0; i < myArray.length; i++){
            System.out.println("Print each element with loop control variable :"+ myArray[i] + " i" );
        }
        Problem : 6 Write a program where you create an integer array of 5 numbers. Loop through the array and assign
       the value of the loop control variable multiplied by 2 to the corresponding index in the array.

        int[] myArray =  {1,2,3,4,5};
        for(int i=0; i < myArray.length; i++){
            System.out.println("Print each element with loop control variable :"+ myArray[i] * 2);
        }


        Problem 7 : Write a program where you create an array of 5 elements. Loop through the array and
        print the value of each element, except for the middle (index 2) element.


        int[] myArray =  {1,2,3,4,5};
        for(int i=0; i < myArray.length; i++){
            if (i != 2){
                System.out.println("The value of the indexes other than second index is:" + myArray[i]);
            }else
                System.out.println("Don't want to print the index 2");
        }
        Problem 8 :Write a program that creates a String array of 5 elements and swaps the first element
        with the middle element without creating a new array.

        String[] stringArray = {"One", "two","three","four", "five"};
        String x = stringArray[0];
        stringArray[0] = stringArray[stringArray.length-3];
        stringArray[stringArray.length-3] = x;
        System.out.println("The value of array after swapping without crating the new array is: "+
                           Arrays.toString(stringArray));


        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the
        array in ascending order, print the smallest and the largest element of the array. The output will
        look like the following:
        Array in ascending order: 0, 1, 2, 4, 9, 13

        The smallest number is 0

        The biggest number is 13


        int[] newArray = {4, 2, 9, 13, 1, 0};
        Arrays.sort(newArray);
        System.out.println("Array in ascending order:" + Arrays.toString(newArray)+"\n");
        int smallestNumber = newArray[0];
        int largestNumber = newArray[0] ;
        for(int i=1 ; i < newArray.length; i++ ){
            if (newArray[i]  < smallestNumber) {
                smallestNumber = newArray[i];
            }

        }
        System.out.println("The smallest number is: " + smallestNumber+ "\n");

        for(int i=1 ; i < newArray.length; i++ ){
            if (newArray[i]  > largestNumber) {
                largestNumber = newArray[i];
            }

        }
        System.out.println("The largest number is: " + largestNumber);



        Problem 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.


        Object[] objects = new Object[5];
        objects[0] = 5;
        objects[1] = "foo";
        objects[2] = "moo";
        objects[3] = "loo";
        objects[4] = 225.0;
        System.out.println("Print the array "+ objects[0].toString());
        System.out.println("Print the array "+ objects[1].toString());
        System.out.println("Print the array "+ objects[2].toString());
        System.out.println("Print the array "+ objects[3].toString());
        System.out.println("Print the array "+ objects[4].toString());

        Problem : Deck and Card
        */


                int[] deck = new int[52];
                String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
                String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

                // Initialize cards
                for (int i = 0; i < deck.length; i++) {
                    deck[i] = i;
                }
               Scanner input = new Scanner(System.in);
               System.out.println("Please enter your card number");
              int userNumber = input.nextInt();



                    String suit = suits[deck[userNumber] / 13];
                    String rank = ranks[deck[userNumber] % 13];
                    System.out.println( rank + " of " + suit);




    }
}
