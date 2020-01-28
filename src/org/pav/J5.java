package org.pav;

import java.util.Scanner;

public class J5 {
  public static void main(String[] args) {
	  System.out.println("enter the num of loop");
	Scanner s=new Scanner(System.in);
	// int n = s.nextInt();
	 for(int i=1;i<=s.nextInt();i++) {
		 int j=0,k=0,a=i;
		 while(a>0) {
			 k=a%10;
			 j=(k*k*k)+j;
			 a=a/10;
		 }
		 if(a==j) {
			 System.out.println(a);
		 }
	 }
	  
}
}
