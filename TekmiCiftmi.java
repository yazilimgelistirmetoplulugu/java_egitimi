package egitim;
import java.util.*;
public class TekmiCiftmi {

	public static void main(String[] args) {
	     
        Scanner sc=new Scanner(System.in);
        
        int sayi;
        System.out.println("Bir sayý giriniz:");
        sayi=sc.nextInt();
         
        if (sayi %2==0) {
            System.out.println(sayi+" Sayýsý Çift Sayýdýr");
             
        }
        else {
        System.out.println(sayi+" Sayýsý Tek Sayýdýr");
        }
    } 

	}


