package ödev2;

import java.util.Scanner;

public class cevap2 {

	public static void main(String[] args) {
		int [] barkod = new int[13]; //dizimiz
		System.out.println("Enter barcod no");
		Scanner sc =new Scanner(System.in);	
		for (int i=0;i<barkod.length;i++) { //diziye barkod elemanlarını atama oluşturma
			int a=sc.nextInt();
			barkod[i]=a;
			
		}
		System.out.println("Scanning Barcod");
		for (int l=0;l<barkod.length;l++) {  //barkod yazdırma
			System.out.print(" "+barkod[l]);
		}
		System.out.println("");
		System.out.println("Last number of barcod "+barkod[12]);
		System.out.println();
		
		System.out.println("valid barcod no");
		for (int l=0;l<barkod.length-1;l++) {  //barkod yazdırma
			System.out.print(""+barkod[l]);
		}
		System.out.println();
		if (10-(((barkod[0]+barkod[2]+barkod[4]+barkod[6]+barkod[8]+barkod[10])*2+(barkod[1]+barkod[3]+barkod[5]+barkod[7]+barkod[9]+barkod[11])*5)%10) == (barkod[12]))//barkodun dogrulugunu kontrol eden algoritma
{
	System.out.println("barcod no is valid");
			
		}
		else System.out.println("barcod no is not valid");

		

	}

}

