/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        //to add players choices
        LinkedList<Integer> list=new LinkedList<>();
        ArrayList<Integer> Players=new ArrayList<>();
        
        int No_of_player=0;
        int No_of_coins=0;
        int[] Coins=new int[100];
        
        System.out.println("Enter Number of Players: ");
        No_of_player=sc.nextInt();
        
        System.out.println("Enter Number of Coins: ");
        No_of_coins=sc.nextInt();
        
        //to chnage the players
        int[] toggle=new int[No_of_player];
        
        //to store diff players coin value
        List<Integer> diff_players[]=new LinkedList[10];
        
        for(int i=0;i<No_of_player;i++)
        {
            toggle[i]=4;
        }
        for(int j=0; j<No_of_player; j++)
        {
            //dynamically generate players list
            diff_players[j]= new LinkedList();
        }
       
        if(No_of_coins%No_of_player==0)
        {
             System.out.println("Enter Coin value: ");
             for(int i=0;i<No_of_coins;i++)
             {
                 list.add(sc.nextInt());
             }
             for(int i=0;i<No_of_coins;i++)
             {
                    for(int l=0;l<No_of_player;l++)
                    {
                         int p=l+1;
                           
                         //check list is empty or not
                        if(!list.isEmpty())
                        {
                        if(list.getFirst()>list.getLast())
                        {
                            System.out.println("\n"+p+" Player Picks "+list.getFirst()+",now number of coin is");
                            //player active state is checked
                            if(toggle[l]==4)
                            {
                                diff_players[l].add(list.getFirst());
                                toggle[l]=2;
                                list.removeFirst();
                            }
                            for(int b=0;b<list.size();b++)
                            {
                                System.out.print(list.get(b)+"\t");
                            }
                        }
                        else{
                            System.out.println("\n"+p+" Player Picks "+list.getLast()+",now number of coin is");
                            if(toggle[l]==4)
                            {
                                diff_players[l].add(list.getLast());
                                toggle[l]=2;
                                list.removeLast();
                            }
                            if(!list.isEmpty())
                            {
                            for(int b=0;b<list.size();b++)
                            {
                                System.out.print(list.get(b)+"\t");
                            }
                            }
                            else
                            {
                                System.out.print("Game Over");
                            }
                                
                        }
                           for(int f=0;f<No_of_player;f++)
                          {
                            toggle[f]=4;
                          }
                        }
                    }
             }
             
             int[] sum=new int[No_of_player];            
           
             for(int k=0;k<No_of_player;k++)
             {          
                    for(int a=0;a<diff_players[k].size();a++)
                    {
                        //sum of the value from the list
                       sum[k]=sum[k]+diff_players[k].get(a);                    
                    }
                                     
             }                
         int max=sum[0];
         int index=0;
         //here we will find the maximum
                    for(int m=0;m<sum.length;m++)
                    {
                      if(max<sum[m])
                      {
                         max=sum[m];
                         index=m;
                      }
                    }
                    for(int k=0;k<No_of_player;k++)
                    {
                        int p=k+1;
                        System.out.println(p+" Player Choices: "+diff_players[k]);                                          
                    }
                    //to print the winner
            System.out.print(" Winner is: "+(index+1) +" Player, By value of coins: "+max);
        }
        else
        {
             System.out.println("Coins can not match multiple of the players!!");
        }
    }
}
