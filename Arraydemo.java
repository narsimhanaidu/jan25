package pattern;

import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[] = new int[5];
 for(int i=0,v=100;i<=4;i++) {
	 a[i]=v;
	 v=v+100;
 }
 for(int i=0;i<=4;i++) {
	 System.out.println(a[i]);
 }
	}

}
