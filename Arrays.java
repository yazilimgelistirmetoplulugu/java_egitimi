package egitim;

public class Arrays {

	public static void main(String[] args) {
		
		
		int[] dizi = {1,2,3,4,5,6}; // farkl� veri tiplerinde diziler olu�turabiliriz 
		String[] isimler = {"ali","veli","ayse"};
		
		
		System.out.println("****** dizi elemanlar� ****");
		
		for(int i=0;i<dizi.length;i++) {
			
			System.out.println("dizi"+i +" ="+ dizi[i]);
		}
		
		
		System.out.println("******   isimler  ****");
		for(int j=0;j<isimler.length;j++) {
			System.out.println("isim"+" "+j +" ="+ isimler[j]);
		}
	}

}
