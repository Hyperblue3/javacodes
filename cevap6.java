package ödev2;

import java.util.*;
public class cevap6 { //recursion yapan class
	static void Hanoikule(int n, char ilkCubuk,
            char sonCubuk, char yardımcıCubuk)
{
if (n == 0) {
return;
}
Hanoikule(n - 1, ilkCubuk, yardımcıCubuk, sonCubuk);//taşıma işlemleri
System.out.println(ilkCubuk + " ====>"+ sonCubuk);
Hanoikule(n - 1, yardımcıCubuk, sonCubuk, ilkCubuk);
}

// main class
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	
	Hanoikule(N, 'X', 'Z', 'Y');//fonksiyonu çağırma
	
}
}
