package egitim;
import java.util.Scanner;  //kullan�c�dan veri almak i�in tan�ml� bir class� �a��rd�k
public class ResitMi {

	public static void main(String[] args) {
		//kullanc�n�n re�it olup olmad���n� bulduran program yazd�ral�m
		Scanner sc = new Scanner(System.in);
		
		
		String name;
        String surname;
        int age;
        
        System.out.println("please enter your name:");
        name = sc.next();
        System.out.println("please enter your surname:");
        surname=sc.next();
        System.out.println("please enter your age:");
        age=sc.nextInt();
        
        if(age<18) {
        	System.out.println(name + " "+surname+ " "+"re�it de�ilsiniz!");
        }
        else {
        	System.out.println(name + " "+surname+ " "+"re�itsiniz");
        }
        
	}

}
