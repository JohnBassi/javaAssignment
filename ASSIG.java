/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig;
import java.util.Scanner;
/**
 *
 * @author DR AMOS BASSI
 */
public class ASSIG{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int primenumber;
        boolean ThisIsPrime=true;
        Scanner john=new Scanner (System.in);   
        System.out.print(" ENTER A NUMBER :");
            int Num=john.nextInt ();
            for (int pn=2; pn<=Num/2;pn++)
            {
                primenumber=Num%pn;
                  if(primenumber==0){
                      ThisIsPrime=false;
                      break;
                  }
                  if(ThisIsPrime)
                   System.out.println(NumValue+ "is a prime number");
                  else
                      System.out.println(NumValue+ " is not a prime number");
            }
    }
                  }
            
// TODO code application logic here
    
    

