/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of Test Cases:");
        //here user will enter the number of test cases in n
        int testcase=sc.nextInt();
        
        //array is for storing the seat no
        int[] seatno=new int[testcase];
        
        //this linked list will store the seatno and seat type
        LinkedList<String> opp_seat_no_type=new LinkedList<>();
        
        //check the testcase 
        //is testcase within the range
        if(testcase>105 && testcase<1)
        {
            //if testcase is >105 and <1 then print below statement
            System.out.println("Enter correct test case between 1 to 105");    
        }
        else
        {
            for(int i=0;i<testcase;i++)
            {
                System.out.println("Enter Seat no: ");
                seatno[i]=sc.nextInt();
            
                //Below Array will contain the type of seat of one compartmet means 12 seat types in a sequence
                List<String> str=Arrays.asList("WS","MS","AS","AS","MS","WS","WS","MS","AS","AS","MS","WS");
        
                // x will store the remainder of seatno mod 12
                // mod 12 because there are 12 seat in one compartment
                int x=seatno[i]%12;
            
                //the as per the remainder we will get the opposite seat nunber and type 
                //eg take seatno 18 then 18 mod 12 is 6 so lets go where x==6
                if(x==1)
                {
                    int oppseat=seatno[i]+11;
                    String seattype=str.get(x-1);
                 
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }
                else if(x==2)
                {
                    int oppseat=seatno[i]+9;
                    String seattype=str.get(x-1);
                 
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }
                else if(x==3)
                { 
                    int oppseat=seatno[i]+7;
                    String seattype=str.get(x-1);
                 
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }   
                else if(x==4)
                { 
                    int oppseat=seatno[i]+5;
                    String seattype=str.get(x-1);
                 
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }
                else if(x==5)
                {
                    int oppseat=seatno[i]+3;
                    String seattype=str.get(x-1);
                 
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }
                else if(x==6)
                {   
                    //opp seat will ne 18+1=19
                    int oppseat=seatno[i]+1;
                    //seattype will be 6-1=5 and 5 in str array is "WS"
                    String seattype=str.get(x-1);
                 
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }   
                else if(x==7)
                {
                    int oppseat=seatno[i]-1;
                    String seattype=str.get(x-1);
                  
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }
                else if(x==8)
                {   
                    int oppseat=seatno[i]-3;
                    String seattype=str.get(x-1);
                  
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }   
                else if(x==9)
                {
                    int oppseat=seatno[i]-5;
                    String seattype=str.get(x-1);
                  
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }
                else if(x==10)
                {
                    int oppseat=seatno[i]-7;
                    String seattype=str.get(x-1);
                  
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }
                else if(x==11)
                {
                    int oppseat=seatno[i]-9;
                    String seattype=str.get(x-1);
            
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }
                else if(x==0)
                {
                    int oppseat=seatno[i]-11;
                    String seattype=str.get(x);
            
                    opp_seat_no_type.add(oppseat+" "+seattype);
                }   
            }
            
            //this below foe loop is use to print the linked list 
            //it will print the seat no and seat type
            for(int i=0;i<opp_seat_no_type.size();i++)
            {
                System.out.println(opp_seat_no_type.get(i));
            }
        }
    }
}
