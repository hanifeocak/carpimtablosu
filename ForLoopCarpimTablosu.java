package day03_forlar;

import java.util.Scanner;

public class ForLoopCarpimTablosu {

	public static void main(String[] args) {
		/*  
		 * 2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
		 
		   ornek Ekran çıktısı
	       1  2  3  4  5
	       2  4  6  8 10
	       3  6  9 12 15
	       4  8 12 16 20
	       5 10 15 20 25		Ekran çıktısı 5 x 5 boyutları için 0rnek olarak verilmiştir 
	       */
Scanner scan=new Scanner(System.in);
System.out.println("Carpim tablosu icin boyut giriniz");
	int boyut=scan.nextInt();
	for (int satir=1; satir <= boyut; satir++) {
		for (int i = 1; i <=boyut; i++) {
			System.out.print(satir*i+" ");
		}
	System.out.println();
	}
	
	
	
	
	}
}




