package org.pav;

import java.util.Scanner;

public class J2 {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n = s.nextInt(),d,i=0;
	while(n>0) {
		d=n%10;
		i=(i*10)+d;
		n=n/10;
	}
	System.out.println(i);
	
   }
}
