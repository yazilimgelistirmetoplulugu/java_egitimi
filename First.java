package egitim;
import java.util.Scanner;  //kullan�c�dan veri almak i�in tan�ml� bir class� �a��rd�k



public class First {

	public static void main(String[] args) {
		
		
		//consola yaz� yazd�rmak
		//System.out.println("Hello World");

		
		Scanner sc = new Scanner(System.in);
		
		//kullan�c�dan al�nan say�lar ile matematiksel i�lemlerin yap�lmas�
		//int =  12
		// double : 12.45
		//string = k�bra 
		// boolean = true , false 
		
		int number1;
		int number2;
		
		
		
		System.out.println("enter Two number:");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        
        
        int sum = number1 +number2;
        int sub = number1-number2;
        int multiple = number1*number2;
        int div = number1 / number2;
        
        //sonu�lar�n consola yazd�r�lmas�
        System.out.println("the sum result is"+ " "+sum);
        System.out.println("the multiple result is"+ " "+multiple);
        System.out.println("the sub result is"+ " "+sub);
        System.out.println("the division result is"+ " "+div);  // de�i�keni int olarak tan�mlad���m�z i�in sonucun sadece tam k�sm� yazd�r�l�r.
        
      
        
        
        
	}

	 
}
