package egitim;
import java.util.*;
public class TekmiCiftmi {

	public static void main(String[] args) {
	     
        Scanner sc=new Scanner(System.in);
        
        int sayi;
        System.out.println("Bir say� giriniz:");
        sayi=sc.nextInt();
         
        if (sayi %2==0) {
            System.out.println(sayi+" Say�s� �ift Say�d�r");
             
        }
        else {
        System.out.println(sayi+" Say�s� Tek Say�d�r");
        }
    } 

	}


