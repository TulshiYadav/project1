package com.durgasoft;

public class Test {

	public static void main(String[] args) {
		int no=6;
		int temp=0;
		for(int i=2;i<=no-1;i++) {
		     	  
			     if(no%i==0) {
			    	 temp=temp+1;
			     }
		}
          if(temp==0) {
        	  System.out.println(no +" "+"IS Prime Number");
          }else {
        	  System.out.println(no+" "+"IS Not prime Number");
          }
	}

}
