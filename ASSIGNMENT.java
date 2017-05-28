package assignment;

import java.util.Scanner;

/* @author DR AMOS BASSI */
public class ASSIGNMENT {
    public static void main(String[] args) {
        
        for (;;)
        {
            Scanner val = new Scanner (System.in) ;
             System.out.println("enter the value :");
             int number = val.nextInt ();
             if(number%2==0){
           System.out.println(number+ " is an even number");
        }
        else {
             System.out.println(number+ " is an odd number");
                }
        // TODO code applica{}tion logic here
        }
    }
}
    