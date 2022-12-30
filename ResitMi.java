package egitim;
import java.util.Scanner;  //kullanýcýdan veri almak için tanýmlý bir classý çaðýrdýk
public class ResitMi {

	public static void main(String[] args) {
		//kullancýnýn reþit olup olmadýðýný bulduran program yazdýralým
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
        	System.out.println(name + " "+surname+ " "+"reþit deðilsiniz!");
        }
        else {
        	System.out.println(name + " "+surname+ " "+"reþitsiniz");
        }
        
	}

}
