/*
 Income > 5lakhs --- Tax = 0%
 Income between 5-10lakhs --- Tax = 20%
 Income > 10lakhs --- Tax = 30%
 */


import java.util.*;

public class income_tax_calc {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter you income ");
       int income = sc.nextInt();

       System.out.println("Your income is "+income);
       
       if (income<500000){
        System.out.println("Total Payable tax= "+"0");
       }
       else if (income>=500000 && income<=1000000){
        System.out.println("Total Payable tax= "+20*income/100);
       }
       else {
        System.out.println("Total Payable tax= "+30*income/100);
       }

   
       sc.close();
        
    } 
        
    }

