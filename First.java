package egitim;
import java.util.Scanner;  //kullanýcýdan veri almak için tanýmlý bir classý çaðýrdýk



public class First {

	public static void main(String[] args) {
		
		
		//consola yazý yazdýrmak
		//System.out.println("Hello World");

		
		Scanner sc = new Scanner(System.in);
		
		//kullanýcýdan alýnan sayýlar ile matematiksel iþlemlerin yapýlmasý
		//int =  12
		// double : 12.45
		//string = kübra 
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
        
        //sonuçlarýn consola yazdýrýlmasý
        System.out.println("the sum result is"+ " "+sum);
        System.out.println("the multiple result is"+ " "+multiple);
        System.out.println("the sub result is"+ " "+sub);
        System.out.println("the division result is"+ " "+div);  // deðiþkeni int olarak tanýmladýðýmýz için sonucun sadece tam kýsmý yazdýrýlýr.
        
      
        
        
        
	}

	 
}
