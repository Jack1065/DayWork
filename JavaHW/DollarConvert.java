package JavaHW;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DollarConvert {
    public static void main(String[] args) {
        /*program which asks user for an entry of 10 dollar amounts which is stored in an array
         and then prints out the converted dollar amounts in terms of $20's, $10's, $5's and $1's
         where the results is then displayed in the console
         */
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println("Please enter 10 dollar amounts:");
        //method for entire process
        fillArr(arr,input);
        input.close();
    }

    public static double[] fillArr(double[] arr, Scanner input){
        //prompts user to enter 10 dollar amounts which are then stored in an array
        for (int i = 0; i < arr.length;i++) {
            System.out.println("Dollar amound number " + (i+1) + ":");
            DecimalFormat twoD = new DecimalFormat("0.00");

            try{   
                //format input to have 2 decimal places then parsed back into a double
               arr[i] = input.nextDouble();
               String num = twoD.format(arr[i]);
               arr[i] = Double.parseDouble(num);
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input exiting program.");
                System.exit(0);
            }

            if (arr[i] < 0) {
                System.out.println("invalid entry exiting program.");
                System.exit(0);
            }
            changeArr(arr[i]);
        }
        return arr;
    }
    public static void changeArr(double num){
        //converts dollar amount to $20's, $10's, $5's and $1's and prints remaining cents
        int twenty = (int) (num/20);
        num-= twenty * 20;
        int ten = (int) (num/10);
        num-= ten * 10;
        int five = (int) (num/5);
        num-= five * 5;
        int one = (int) (num/1);
        num-= one * 1;

        System.out.printf("= %d $20(s) + %d $10(s) + %d $5(s) + %d $1(s) + %.2f cents\n",twenty, ten, five, one, num);


        }
      
     }

