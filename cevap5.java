package ödev2;

public class cevap5 {
	public static void main(String[] args ) {
		
	    int zar1;
	    int zar2;
	    int zar3;
	    int zar4;
		
		int money1=15;
		int money2=18;
		int i=0; //tur sayısı
		do {
			
			i++;
			
			 zar1=(int) (Math.random()*6+1);//zarlar
			 zar2=(int) (Math.random()*6+1);
			 zar3=(int) (Math.random()*6+1);
			 zar4=(int) (Math.random()*6+1);
			 int zartoplam1=zar1+zar2;
				int zartoplam2=zar3+zar4;//toplamlar
			System.out.println("Oyunda "+i+". tur başlıyor");
			System.out.println("1. turda 1. oyuncunun zar toplamlari: "+(zar1+zar2));
			System.out.println("1. zar değeri = "+zar1+ " ve 2. zar değeri = "+zar2+ " toplami = "+(zar1+zar2));
			System.out.println("1. turda 2. oyuncunun zar toplamlari: "+(zar3+zar4));
			System.out.println("1. zar değeri = "+zar3+ " ve 2. zar değeri = "+zar4 +" toplami = "+(zar3+zar4));
				if (zartoplam1>zartoplam2) {
					System.out.println("Zarlar arasindaki fark= "+(zartoplam1-zartoplam2));
					System.out.println("Birinci oyuncu "+(zartoplam1-zartoplam2)+"para kazandi");
					money1 +=(zartoplam1-zartoplam2);
					money2 -=(zartoplam1-zartoplam2);
					System.out.println("Birinci oyuncunun parası= "+money1+"İkinci oyuncunun parası "+money2);
		              }
					if (zartoplam2>zartoplam1) {
						System.out.println("Zarlar arasindaki fark= "+(zartoplam2-zartoplam1));
						System.out.println("İkinci oyuncu "+(zartoplam2-zartoplam1)+"para kazandi");
						money2 +=(zartoplam2-zartoplam1);
						money1 -=(zartoplam2-zartoplam1);
						System.out.println("Birinci oyuncunun parası= "+money1+"İkinci oyuncunun parası "+money2);
						
					}
					if(zartoplam1==zartoplam2) {
						System.out.println("Zarlar arasindaki fark= "+(zartoplam2-zartoplam1));
					}
		}
		
		while(money1 >0 && money2 >0);// oyunculardan birisinin parası bitince kadar devam etme kosulu
		if(money1 >0) {
			System.out.println("1. oyuncu "+i+". turda "+money1+" para ile kazandı");//kazanan oyuncuyu belirleme
		}
		if(money2 >0) {
			System.out.println("2. oyuncu "+i+". turda "+money2+" para ile kazandı");
		}
		

	}
	

}
