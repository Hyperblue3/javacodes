package ödev2;

import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class diceroll {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter dice number");
		int a=sc.nextInt();
		System.out.println("Enter number of dice roll");
		int b=sc.nextInt();
		int i=0;
		int toplam=0;
		int k=1;
		int[] list = new int [] {};
		int entoplam=0;
		
		do {//atış sayısı
			 
			do  {// do döngüsü ile zarın yüzünü öğrenme
		    	int zar1=(int) (Math.random()*6+1);//zar
		    	
				if (zar1 == 1) {
					System.out.print("  .  ");
					toplam+=1;
					
				}
				if (zar1 == 2) {
					System.out.print("  :  ");
					toplam+=2;
				}
				if (zar1 == 3) {
					System.out.print("  :.  ");
					toplam+=3;
				}
				if (zar1 == 4) {
					System.out.print("  ::  ");
					toplam+=4;
				}
				if (zar1 == 5) {
					System.out.print("  ::.  ");
					toplam+=5;
				}
				if (zar1 == 6) {
					System.out.print("  :::  ");
					toplam+=6;
				}
				System.out.print("<== "+(i+1)+".zar");
				a--;
				i++;
				 entoplam+=toplam;
		    	
		    	
		    }
		    while(a>0);
			toplam=0;
		   System.out.println("          "+k+".roll");
		  
		   
		   b--;
		   k++;
		   do {
			   i--;
			   a++;
		   }
		   while(i>0);
		}
		while(b>0);
		

	}

}
