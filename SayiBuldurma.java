package egitim;
import java.util.*;

public class SayiBuldurma {

	public static void main(String[] args) {
		
		
		int[] sayilar = new int[] {1,4,5,7,8,9,10,45,478,78,26};
		
		
		boolean varMi=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dizi i�erisinde aramak istedi�iniz say�y� giriniz:");
		int sayi = sc.nextInt();
		
		for (int i : sayilar) {
			if(i==sayi) {
				varMi=true;
				break;
				
			}
			
		}
		if(varMi) {
			System.out.println("Arad���n�z say� dizi i�erisinde mevcut");
			
		}
		else {
			System.out.println("Arad���n�z say� dizi i�erisinde mevcut de�il");
		}

	}

}
