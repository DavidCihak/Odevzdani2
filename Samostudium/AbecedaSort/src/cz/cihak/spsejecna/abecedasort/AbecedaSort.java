package cz.cihak.spsejecna.abecedasort;

import java.util.Scanner;

public class AbecedaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num;
	        String x;
	        Scanner sc = new Scanner(System.in);
	        
	        //User will be asked to enter the num of strings 
	        System.out.print("Napiš kolik jmén chceš zadat:");
	        num = sc.nextInt();
	        
	        
	        String str[] = new String[num];
	        Scanner sc2 = new Scanner(System.in);
	        
	        //User is entering the strings and they are stored in an array
	        System.out.println("Napiš"+ num +" jmen, které chceš seøadit: ");
	        for(int i = 0; i < num; i++)
	        {
	            str[i] = sc2.nextLine();
	        }
	        sc.close();
	        sc2.close();
	        
	        //Sorting the strings
	        for (int i = 0; i < num; i++) 
	        {
	            for (int j = i + 1; j < num; j++) { 
	                if (str[i].compareTo(str[j])>0) 
	                {
	                    x = str[i];
	                    str[i] = str[j];
	                    str[j] = x;
	                }
	            }
	        }
	        
	        //Displaying the strings after sorting them based on alphabetical order
	        System.out.print("Strings in Sorted Order: ");
	        for (int i = 0; i <= num - 1; i++) 
	        {
	            System.out.print(str[i] + ", ");
	        }
	    }
	}


