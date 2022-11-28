package ödev2;

public class DiceGamePvP {
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
			System.out.println("In game "+i+". turn starting");
			System.out.println("on 1st turn sum of the 1st player's dices: "+(zar1+zar2));
			System.out.println("1. zar değeri = "+zar1+ " ve 2. zar değeri = "+zar2+ " toplami = "+(zar1+zar2));
			System.out.println("on 1st turn sum of the 2nd player's dices: "+(zar3+zar4));
			System.out.println("value of 1st dice = "+zar3+ " value of 2nd dice = "+zar4 +" sum of them = "+(zar3+zar4));
				if (zartoplam1>zartoplam2) {
					System.out.println("Zarlar arasindaki fark= "+(zartoplam1-zartoplam2));
					System.out.println("Birinci oyuncu "+(zartoplam1-zartoplam2)+"para kazandi");
					money1 +=(zartoplam1-zartoplam2);
					money2 -=(zartoplam1-zartoplam2);
					System.out.println("Birinci oyuncunun parası= "+money1+"İkinci oyuncunun parası "+money2);
		              }
					if (zartoplam2>zartoplam1) {
						System.out.println("Diffirence of dices= "+(zartoplam2-zartoplam1));
						System.out.println("2nd player won "+(zartoplam2-zartoplam1)+" $");
						money2 +=(zartoplam2-zartoplam1);
						money1 -=(zartoplam2-zartoplam1);
						System.out.println("Money of the 1st player= "+money1+"Money of the 2nd player "+money2);
						
					}
					if(zartoplam1==zartoplam2) {
						System.out.println("Diffirences between dices= "+(zartoplam2-zartoplam1));
					}
		}
		
		while(money1 >0 && money2 >0);// oyunculardan birisinin parası bitince kadar devam etme kosulu
		if(money1 >0) {
			System.out.println("1st player on "+i+".turn won with "+money1+"$");//kazanan oyuncuyu belirleme
		}
		if(money2 >0) {
			System.out.println("2nd player on "+i+". turn won with "+money2+"$");
		}
		

	}
	

}
