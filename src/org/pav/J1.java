package org.pav;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
    	System.out.println("enter the num");
    	Scanner s=new Scanner(System.in);
    	int n = s.nextInt();
    	int fact=1;
    	for(int i=1;i<=n;i++) {
    		fact=fact*i;
    		
    	}
    	System.out.println(fact);
    	System.out.println(fact);
    	System.out.println(fact);
   }
}
