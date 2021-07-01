package constructordenemesi;

import java.util.Scanner;

public class Yemekler {
			
		private String yemekAdi;
		private String yemekT�r�;
		private double yemekFiyati;
		private int yemekMiktari;
		private double yemekKazanci;
		private double yemekMaliyeti;
		

		

		public Yemekler(String yemekAdi, String yemekT�r�, double yemekFiyati, int yemekMiktari,double yemekKazanci,double yemekMaliyeti) {
			
			this.yemekAdi= yemekAdi;
			this.yemekT�r� = yemekT�r�;
			this.yemekFiyati= yemekFiyati;
			this.yemekMiktari= yemekMiktari;		
			this.yemekKazanci= yemekKazanci;
			this.yemekMaliyeti= yemekMaliyeti;
		}
		
		public void yemekSat(int adet) {
			


			this.yemekKazanci =(yemekFiyati*adet);

			
			if (yemekMiktari<adet){
				
				System.out.println(adet+" adet "+yemekAdi+" bulunmamaktadir."+yemekAdi+" miktarimiz "+yemekMiktari+" adettir.");
			}	
			
			
				
			else  {					
					
					
				System.out.println("Satilan yemek adedi: "+adet);
				System.out.println("Satilan yemekten elde edilen kazanc: "+yemekKazanci);
				System.out.println("Satilan yemekten elde edilen kar: "+ (yemekKazanci-yemekMaliyeti*adet));
				System.out.println("Kalan yemek miktari: "+yemekMiktari);
			
			}}


		public void pastaEkle(int adet) {
					
			yemekMiktari +=adet;
			yemekMaliyeti = adet*yemekMaliyeti;
			

			System.out.println("Eklenen pasta adedi: "+adet);
			System.out.println("Eklenen pasta icin �denen �cret: "+yemekMaliyeti);
			System.out.println("G�ncel pasta miktari: "+yemekMiktari);
			
		}

		public String getYemekAdi() {
			return yemekAdi;
		}

		public void setYemekAdi(String yemekAdi) {
			this.yemekAdi = yemekAdi;
		}

		public String getYemekT�r�() {
			return yemekT�r�;
		}

		public void setYemekT�r�(String yemekT�r�) {
			this.yemekT�r� = yemekT�r�;
		}

		public double getYemekFiyati() {
			return yemekFiyati;
		}

		public void setYemekFiyati(double yemekFiyati) {
			this.yemekFiyati = yemekFiyati;
			
		}

		public int getYemekMiktari() {
			return yemekMiktari;
		}

		public void setYemekMiktari(int yemekMiktari) {
			this.yemekMiktari = yemekMiktari;
		}

		public double getYemekKazanci() {
			return yemekKazanci;
		}

		public void setYemekKazanci(double yemekKazanci) {
			this.yemekKazanci = yemekKazanci;
		}

		public double getYemekMaliyeti() {
			return yemekMaliyeti;
		}

		public void setYemekMaliyeti(double yemekMaliyeti) {
			this.yemekMaliyeti = yemekMaliyeti;
		}}		
